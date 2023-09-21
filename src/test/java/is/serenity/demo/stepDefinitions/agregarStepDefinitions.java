package is.serenity.demo.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import is.serenity.demo.tasks.LogueoTask;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.*;


public class agregarStepDefinitions {


    @Before
    public void setStage() {

        setTheStage(new OnlineCast());
    }

    @Dado("el usuario esta logueado en la pagina demo Serenity y de clic en NortWind")
    public void el_usuario_esta_logueado_en_la_pagina_demo_serenity_y_de_clic_en_nort_wind() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://demo.serenity.is/"),
                LogueoTask.paraLoguear()
        );
            }

    @Cuando("el usuario da clic en Products y selecciona el boton New Product")
    public void el_usuario_da_clic_en_products_y_selecciona_el_boton_new_product() {
        theActorInTheSpotlight().attemptsTo(
             //   Click.on(LINK_NORTHWIND)
        );


    }

    @Cuando("el usuario diligencie el formulario cargando la imagen")
    public void el_usuario_diligencie_el_formulario_cargando_la_imagen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entonces("el usuario validara el New Product de forma aleatoria")
    public void el_usuario_validara_el_new_product_de_forma_aleatoria() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
