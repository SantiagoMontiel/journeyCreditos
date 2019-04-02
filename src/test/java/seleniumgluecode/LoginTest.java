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

public class LoginTest{

	Login pageLogin = new Login();
	Navigation navigator = new Navigation();

	@After
	public void takeScreenshot(Scenario scenario) {
		navigator.takeScreenshot(scenario);
	}

	@After
	public void closeBrowser(){
		navigator.close();
	}

	@Then("^Se muestra el Onboarding del usuario logueado$")
	public void se_muestra_el_Onboarding_del_usuario_logueado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}


}
