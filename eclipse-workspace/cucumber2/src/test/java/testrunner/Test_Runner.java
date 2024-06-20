package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"features"},
		glue = {"stepss"},
		plugin = {"pretty", "html:Reports/MyReport.html"},
		dryRun = false,
		tags = "@P11",
		monochrome = false
		)
public class Test_Runner {

}
