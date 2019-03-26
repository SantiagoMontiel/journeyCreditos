package seleniumgluecode;

import cucumber.api.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.Navigation;

import static java.lang.Thread.sleep;

public class Test extends Navigation {

	@After
	public void takeScreenshot(Scenario scenario) {
		super.takeScreenshot(scenario);
	}
	
	@Given("^El usuario se encuentra en la pagina principal$")
	public void el_usuario_se_encuentra_en_la_pagina_principal() throws Throwable {
		navigate();
	}

	@When("^El usuario ingresa usuario y password$")
	public void el_usuario_ingresa_usuario_y_password() throws Throwable {

		//Ingreso el usuario
		complete("name","userName", "Santi");

		//Ingreso password
		complete("name","password", "Manda");

	}

	@When("^Hace click en aceptar$")
	public void hace_click_en_aceptar() throws Throwable {

		clickear("xpath", "//*[@id=\"root\"]/div/div/div[2]/div[2]/form/div[5]/button[1]");
		sleep(4000);
	}

	@Then("^Se muestra el Onboarding del usuario logueado\\.$")
	public void se_muestra_el_Onboarding_del_usuario_logueado() throws Throwable {

		if(!exists("xpath", "//*[@id=\"root\"]/div/div/main")){
			throw new Exception("No se muestra el Onboarding correctamente");
		}

	}
	
}
