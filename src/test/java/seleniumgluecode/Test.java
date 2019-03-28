package seleniumgluecode;

import cucumber.api.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import runner.Navigation;
import pageObjects.Login;

import static java.lang.Thread.sleep;

public class Test extends Navigation {

	Login pageLogin = new Login();

	@After
	public void takeScreenshot(Scenario scenario) {
		super.takeScreenshot(scenario);
	}

	@After
	public void closeBrowser(){
		close();
	}

	@Given("^El usuario se encuentra en la pagina de login$")
	public void el_usuario_se_encuentra_en_la_pagina_principal() throws Throwable {
		navigate(pageLogin.getUrl());
	}

	@When("^El usuario ingresa usuario y password$")
	public void el_usuario_ingresa_usuario_y_password() throws Throwable {
		complete(pageLogin.getFieldUser(), "Santi");
		complete(pageLogin.getFieldPass(), "Manda");
	}

	@When("^Hace click en aceptar$")
	public void hace_click_en_aceptar() throws Throwable {
		click(pageLogin.getButtonAccept());
		sleep(3000);
	}

	@Then("^Se muestra el Onboarding del usuario logueado\\.$")
	public void se_muestra_el_Onboarding_del_usuario_logueado() throws Throwable {
		if(!exists(By.xpath("//*[@id=\"root\"]/div/div/main"))){
			throw new Exception("No se muestra el Onboarding correctamente");
		}
	}

	@When("^El usuario ingresa santi y password manda$")
	public void el_usuario_ingresa_santi_y_password_manda() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^Se muestra el Onboarding del usuario logueado success\\.$")
	public void se_muestra_el_Onboarding_del_usuario_logueado_success() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^El usuario ingresa mex y password gato$")
	public void el_usuario_ingresa_mex_y_password_gato() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	
}
