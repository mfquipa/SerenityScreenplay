package is.serenity.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static is.serenity.demo.ui.ProductsUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NEW)
        );
    }

    public static Performable product(){
        return instrumented(ProductsTask.class);
    }
}
