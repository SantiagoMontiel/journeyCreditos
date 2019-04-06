package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.Navigation;

import static java.lang.Thread.sleep;

public class AgreementsTest{


    @Then("^Se muestra el Onboarding del usuario con acuerdo vigente$")
    public void se_muestra_el_Onboarding_del_usuario_con_acuerdo_vigente() throws Throwable {
//		if(!exists(By.xpath("//*[@id=\"root\"]/div/div/main"))){
//			throw new Exception("No se muestra el Onboarding correctamente");
//		}
    }

    @Then("^Se muestra el Onboarding del usuario con acuerdo vigente sin margen disponible$")
    public void se_muestra_el_Onboarding_del_usuario_con_acuerdo_vigente_sin_margen_disponible() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sleep(1000);
    }

    @Then("^Se muestra el Onboarding del usuario sin acuerdo vigente$")
    public void se_muestra_el_Onboarding_del_usuario_sin_acuerdo_vigente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sleep(1000);
    }


}
