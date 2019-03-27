package pageObjects;

import org.openqa.selenium.By;

public class Login {

    private String url = "http://localhost:3000/api-poc/login";
    private By fieldUser = By.name("userName");
    private By fieldPass = By.name("password");
    private By buttonAccept = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/form/div[5]/button[1]");

    public String getUrl() {
        return url;
    }

    public By getFieldUser() {
        return fieldUser;
    }

    public By getFieldPass() {
        return fieldPass;
    }

    public By getButtonAccept() {
        return buttonAccept;
    }

}
