package is.serenity.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import is.serenity.demo.utils.Excel;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static is.serenity.demo.ui.LogueoDemo.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogueoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<Map<String, String>> data;
        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Datos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(data.get(0).get("Usuario")).into(TXT_USUARIO).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).get("Contraseña")).into(TXT_CONTRASEÑA).thenHit(Keys.ENTER),
                Click.on(FIRST_NAV_MENU_ITEM)
        );
    }

    public static Performable paraLoguear() {
        return instrumented(LogueoTask.class);
    }
}
