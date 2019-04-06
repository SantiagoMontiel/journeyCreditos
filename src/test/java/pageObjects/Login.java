package pageObjects;

import org.openqa.selenium.By;

public class Login extends PageBase{

    private String url = "http://localhost:3000/";
    private By fieldCuit = By.name("cuit");
    private By buttonEnviar = By.id("btn-submit-formCuit");

    public String getUrl() {
        return url;
    }

    public By getFieldCuit() {
        return fieldCuit;
    }

    public By getButtonEnviar() {
        return buttonEnviar;
    }

}
