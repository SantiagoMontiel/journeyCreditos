package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import java.io.File;
import org.junit.AfterClass;
import com.cucumber.listener.Reporter;


@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features"
,glue= {"seleniumgluecode", } ,plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
monochrome = true, format={"json:target/Destination/cucumber.json"}
)

public class Testrunner {
	 @AfterClass
	   public static void writeExtentReport() {
	 		Reporter.loadXMLConfig(new File("./config/reports.xml"));
	 	}

}
