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


//	@When("^El usuario ingresa \"([^\"]*)\" y password \"([^\"]*)\"$")
//	public void el_usuario_ingresa_y_password(String user, String password) throws Throwable {
//		complete(pageLogin.getFieldUser(), user);
//		complete(pageLogin.getFieldPass(), password);
//	}
//
//	@When("^Hace click en aceptar$")
//	public void hace_click_en_aceptar() throws Throwable {
//		click(pageLogin.getButtonAccept());
//		sleep(3000);
//	}


}
