package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
( 		features="classpath:features",
		glue="",
		tags="",
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/results.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				
		dryRun=false,
		monochrome = true

		)
public class RunTest {

}

