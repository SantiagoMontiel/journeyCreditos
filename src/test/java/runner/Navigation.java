package runner;

import cucumber.api.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Navigation {

    //1: Chrome 2: Internet Explorer
    private BrowserDriver browserDriver = new BrowserDriver(2);


    public void navigate(String url)throws Throwable {
        browserDriver.loadPage(url);
    }

    public void takeScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot)browserDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
    }

    public void complete(By element, String value)throws Throwable{

        //Se ingresa caracter por caracter si el browser es IE dado que puede tener inconvenientes
        if(browserDriver.isIE()){
            while (!browserDriver.getDriver().findElement(element).getAttribute("value").equals(value)) {
                for (int i = 0; i < value.length(); i++) {
                    browserDriver.getDriver().findElement(element).sendKeys(value.substring(i, i + 1));
                }
            }
        }
        else {
            browserDriver.getDriver().findElement(element).sendKeys(value);
        }
        //            throw new Exception("No se pudo completar" + type + "con el valor: " + value);
    }

    public void click(By element) {

            browserDriver.getDriver().findElement(element).click();
        //    throw new Exception("No se pudo clickear sobre el boton " + button);

    }

    public boolean exists(By element) throws Exception {

        if (browserDriver.getDriver().findElements(element).size() > 0) {
            return true;
        } else {
            return false;
        }
    }
//            throw new Exception("El tipo: " + type + "no es valido");

    public void close(){
        browserDriver.close();
    }

}
