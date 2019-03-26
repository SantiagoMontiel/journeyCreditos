package runner;

import cucumber.api.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Navigation {

    private BrowserDriver browserDriver = new BrowserDriver();

    public void navigate()throws Throwable {
        browserDriver.loadPage(
                "http://localhost:3000/api-poc/login");
    }

    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot)browserDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }

    public void complete(String type, String field, String value)throws Throwable{

        if ("name".equals(type)) {
            browserDriver.getDriver().findElement(By.name(field)).sendKeys(value);
        } else if ("xpath".equals(type)) {
            browserDriver.getDriver().findElement(By.xpath(field)).sendKeys(value);
        } else{
            throw new Exception("No se pudo cumpletar" + type + "con el valor: " + value);
        }
    }

    public void clickear(String type, String button) throws Exception {
        if ("name".equals(type)) {
            browserDriver.getDriver().findElement(By.name(button)).click();
        } else if ("xpath".equals(type)) {
            browserDriver.getDriver().findElement(By.xpath(button)).click();
        } else{
            throw new Exception("No se pudo clickear sobre el boton " + button);
        }
    }

    public boolean exists(String type, String value) throws Exception {

        if ("name".equals(type)) {
            return browserDriver.getDriver().findElements(By.name(value)).size() > 0;
        } else if ("xpath".equals(type)) {
            return browserDriver.getDriver().findElements(By.xpath(value)).size() > 0;
        } else{
            throw new Exception("El tipo: " + type + "no es valido");
        }

    }


}
