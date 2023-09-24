package is.serenity.demo.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import is.serenity.demo.tasks.DashboardTask;
import is.serenity.demo.tasks.LogueoTask;
import is.serenity.demo.tasks.NewProductTask;
import is.serenity.demo.tasks.ProductsTask;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.*;


public class agregarStepDefinitions {

    @Before
    public void setStage() {

        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario esta logueado en la pagina demo Serenity")
    public void que_el_usuario_esta_logueado_en_la_pagina_demo_serenity() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://demo.serenity.is/")
        );
        theActorInTheSpotlight().attemptsTo(
                LogueoTask.paraLoguear()
        );
    }

    @Cuando("el usuario valida que esta en Dashboard luego da click en Northwind y selecciona a Products")
    public void el_usuario_valida_que_esta_en_dashboard_luego_da_click_en_northwind_y_selecciona_a_products() {
        theActorInTheSpotlight().attemptsTo(
                DashboardTask.menu(),
                ProductsTask.product()
        );
    }

    @Cuando("cuando el usuario da clic al boton New Product diligencie el formulario cargando una imagen")
    public void cuando_el_usuario_da_clic_al_boton_new_product_diligencie_el_formulario_cargando_una_imagen() {
       theActorInTheSpotlight().attemptsTo(
               NewProductTask.formulario()
       );
    }

    @Entonces("el usuario validara la creacion del New Product de forma aleatoria")
    public void el_usuario_validara_la_creacion_del_new_product_de_forma_aleatoria() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }
}

