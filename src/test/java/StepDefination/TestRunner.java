package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature",glue="StepDefination",

plugin = { "pretty", "json:target/cucumber-report.json" }, // Report options
monochrome = true // Readable output		
 )
public class TestRunner {
	


}
