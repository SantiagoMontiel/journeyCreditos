package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.Login;
import runner.Navigation;

public class Hooks {

    private static Login pageLogin;
    private static Navigation navigator;

    public static Login getPageLogin(){
        return pageLogin;
    }

    public static Navigation getNavigator() {
        return navigator;
    }

    @Before
    public void setUp(){
        pageLogin = new Login();
        navigator = pageLogin.getNavigator();
    }

    @After
    public void closeBrowser(){
        navigator.close();
    }

    @After
    public void takeScreenshot(Scenario scenario) {
        navigator.takeScreenshot(scenario);
    }

}
