package is.serenity.demo.tasks;

import is.serenity.demo.interactions.AleatorioNewProduct;
import is.serenity.demo.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;


import static is.serenity.demo.ui.NewProductUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NewProductTask implements Task {

    File file = new File("C:\\Users\\Fer\\IdeaProjects\\serenityScreenplay\\src\\test\\resources\\Data\\1.png");
    String rutapath=file.getAbsolutePath();
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<Map<String, String>> data;
        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Datos");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(data.get(0).get("NombreProducto")).into(NOMBRE_PROD).thenHit(Keys.ENTER),
                AleatorioNewProduct.randomListas(),
                //Click.on(BTN_IMAGEN),
                //Enter.keyValues(rutapath).into(SUBIR_IMAGEN),
                //WaitUntil.the(SUBIR_IMAGEN, isVisible()),
                //Upload.theFile((),
                Scroll.to(SCROLL_PAG),
                Enter.theValue(data.get(0).get("Cantidad")).into(INPUT_CANT).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).get("Precio")).into(INPUT_PRECIO).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).get("Stock")).into(INPUT_STOCK).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).get("Orden")).into(INPUT_ORDEN).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).get("Nivel")).into(INPUT_NIVEL).thenHit(Keys.ENTER),
                Click.on(BTN_GUARDAR)
        );
        try {
            Robot robot = new Robot();


        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }

    public static Performable formulario() {
        return instrumented(NewProductTask.class);
    }
}
