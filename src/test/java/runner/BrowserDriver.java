package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.util.concurrent.TimeUnit;

public class BrowserDriver {

    private static WebDriver mDriver;
    private Boolean isIE;

    public BrowserDriver(Integer browser){

        switch (browser){
            case 1:
                System.out.println("Chrome is selected");

                //Deshabilitar extensiones para permitir que el navegador se ejecute correctamente
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                options.setExperimentalOption("useAutomationExtension", false);

                System.setProperty("webdriver.chrome.driver","C:\\chromedriver/chromedriver.exe");
                mDriver = new ChromeDriver(options);
                isIE = false;

                break;
            case 2:
                System.out.println("Internet Explorer is selected");

                System.setProperty("webdriver.ie.driver","C:\\iedriver/IEDriverServer.exe");
                mDriver = new InternetExplorerDriver();
                isIE = true;
                break;
            default:
                System.out.println("No seleccionaste ningun explorador valido: 1: Chrome 2: Internet Explorer");
        }

    }

    public boolean isIE() {
        return isIE;
    }

    public WebDriver getDriver(){
        return mDriver;
    }

    public synchronized static WebDriver getCurrentDriver() {
        if (mDriver==null) {
            try {
                mDriver = new ChromeDriver();
            } finally{
                Runtime.getRuntime().addShutdownHook(
                        new Thread(new BrowserCleanup()));
            }
        }
        return mDriver;
    }

    private static class BrowserCleanup implements Runnable {
        public void run() {
            System.out.println("Cerrando el navegador");
            close();
        }
    }

    public static void close() {
        try {
            getCurrentDriver().quit();
            mDriver = null;
            System.out.println("Cerrando el navegador");
        } catch (UnreachableBrowserException e) {
            System.out.println("se puede cerrar el navegador: navegador inalcanzable");
        }
    }

    public static void loadPage(String url){
        mDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mDriver.get(url);
        mDriver.manage().window().maximize();
    }

}
