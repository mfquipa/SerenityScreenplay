package is.serenity.demo.interactions;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Random;

import static is.serenity.demo.ui.NewProductUi.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AleatorioNewProduct implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIST_PROOVEDOR)
        );

        List<WebElementFacade> listProveedores = LIST_PROOVEDOR.resolveAllFor(actor);
        Random random = new Random();
        int indexRandom = random.nextInt(listProveedores.size());
        System.out.printf("random");
        System.out.println(indexRandom);
        String nombreProveedor=listProveedores.get(indexRandom).getText();
        System.out.printf("nombre pro");
        System.out.println(nombreProveedor);
        listProveedores.get(indexRandom).click();

        actor.attemptsTo(
                Click.on(LIST_CATEGORIA)
        );

        List<WebElementFacade> listCategorias = SELEC_CATEGORIA.resolveAllFor(actor);
        Random random1 = new Random();
        int indexRandom1 = random1.nextInt(listCategorias.size());
        listCategorias.get(indexRandom1).click();
    }

    public static Performable randomListas() {
        return instrumented(AleatorioNewProduct.class);
    }
}

