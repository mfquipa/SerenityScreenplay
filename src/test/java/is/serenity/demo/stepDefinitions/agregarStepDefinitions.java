package is.serenity.demo.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import is.serenity.demo.tasks.DashboardTask;
import is.serenity.demo.tasks.LogueoTask;
import is.serenity.demo.tasks.NewProductTask;
import is.serenity.demo.tasks.ProductsTask;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.*;


public class agregarStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Que el usuario esta en el sitio web")
    public void que_el_usuario_esta_en_el_sitio_web() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://demo.serenity.is/")
        );
    }

    @When("EL usuario se dirige a crear un producto")
    public void el_usuario_se_dirige_a_crear_un_producto() {
        theActorInTheSpotlight().attemptsTo(
                LogueoTask.paraLoguear(),
                DashboardTask.menu(),
                ProductsTask.product()
        );
    }

    @Then("podra ver el producto y pudo filtrarlo exitosamente")
    public void podra_ver_el_producto_y_pudo_filtrarlo_exitosamente() {
        theActorInTheSpotlight().attemptsTo(
                NewProductTask.formulario()
        );
    }

}

