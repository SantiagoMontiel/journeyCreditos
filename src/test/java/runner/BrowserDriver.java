package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.util.concurrent.TimeUnit;

public class BrowserDriver {

    private static WebDriver mDriver;

    public BrowserDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver/chromedriver.exe");
    	mDriver = new ChromeDriver();
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

    public static void loadPage(String url){;
        mDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mDriver.get(url);
        mDriver.manage().window().maximize();
    }

}
