package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = ".//Features/simple_form_Login.feature",
			glue = "stepDefinitions",
			dryRun = false,
			monochrome = true,
			plugin = {"pretty",
					"html:target/htmlreport.html", "json:target/cucumber.json"}
		)

public class Test_run {
	
}
