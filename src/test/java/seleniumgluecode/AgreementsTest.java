package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Login;
import runner.Navigation;

import static java.lang.Thread.sleep;

public class AgreementsTest {

    Login pageLogin = new Login();
    Navigation navigator = new Navigation();

    @Given("^El usuario se encuentra en la pagina de ingreso de cuit$")
    public void el_usuario_se_encuentra_en_la_pagina_principal() throws Throwable {
        navigator.navigate(pageLogin.getUrl());
    }

    @Then("^Se muestra el Onboarding del usuario con acuerdo vigente$")
    public void se_muestra_el_Onboarding_del_usuario_con_acuerdo_vigente() throws Throwable {
//		if(!exists(By.xpath("//*[@id=\"root\"]/div/div/main"))){
//			throw new Exception("No se muestra el Onboarding correctamente");
//		}
    }

    @When("^Hace click en Enviar$")
    public void hace_click_en_Enviar() throws Throwable {
        navigator.click(pageLogin.getButtonEnviar());
        sleep(2000);
    }

    @When("^El usuario ingresa \"([^\"]*)\"$")
    public void el_usuario_ingresa(String cuit) throws Throwable {
        navigator.complete(pageLogin.getFieldCuit(), cuit);
    }

    @Then("^Se muestra el Onboarding del usuario con acuerdo vigente sin margen disponible$")
    public void se_muestra_el_Onboarding_del_usuario_logueado_con_margenes_sin_disponibles() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Se muestra el Onboarding del usuario sin acuerdo vigente$")
    public void se_muestra_el_Onboarding_del_usuario_logueado_sin_margenes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @After
    public void closeBrowser(){
        navigator.close();
    }

}
