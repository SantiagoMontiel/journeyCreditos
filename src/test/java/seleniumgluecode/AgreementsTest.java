package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Login;
import runner.Navigation;

import static java.lang.Thread.sleep;

public class AgreementsTest extends Navigation {

    Login pageLogin = new Login();

    @Given("^El usuario se encuentra en la pagina de ingreso de cuit$")
    public void el_usuario_se_encuentra_en_la_pagina_principal() throws Throwable {
        navigate(pageLogin.getUrl());
    }

    @Then("^Se muestra el Onboarding del usuario logueado\\.$")
    public void se_muestra_el_Onboarding_del_usuario_logueado() throws Throwable {
//		if(!exists(By.xpath("//*[@id=\"root\"]/div/div/main"))){
//			throw new Exception("No se muestra el Onboarding correctamente");
//		}
    }

    @When("^Hace click en Enviar$")
    public void hace_click_en_Enviar() throws Throwable {
        click(pageLogin.getButtonEnviar());
        sleep(2000);
    }

    @When("^El usuario ingresa \"([^\"]*)\"$")
    public void el_usuario_ingresa(String cuit) throws Throwable {
        complete(pageLogin.getFieldCuit(), cuit);
    }

    @Then("^Se muestra el Onboarding del usuario logueado con margenes sin disponibles\\.$")
    public void se_muestra_el_Onboarding_del_usuario_logueado_con_margenes_sin_disponibles() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Se muestra el Onboarding del usuario logueado sin margenes \\.$")
    public void se_muestra_el_Onboarding_del_usuario_logueado_sin_margenes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @After
    public void closeBrowser(){
        close();
    }

}
