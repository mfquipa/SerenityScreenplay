package is.serenity.demo.tasks;

import is.serenity.demo.ui.DashboardUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static is.serenity.demo.ui.DashboardUi.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.Matchers.equalTo;

public class DashboardTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        /*actor.should(
                seeThat(
                        "la respuesta es",
                        Text.of(LBL_TITULO.getName()).asString(),equalTo("Dashboard")
                )
        );*/
        actor.attemptsTo(
                Click.on(MENU_NORTHWIND),
                Click.on(OPCION_PROD)

        );

    }

    public static Performable menu() {
        return instrumented(DashboardTask.class);
    }
}
