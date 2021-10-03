package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Features", 
glue= {"StepDefinitions"},
monochrome=true, 

plugin = {"html:target/reports/cucumber-html-report.html", 
			"json:target/reports/cucumber.json", 
			"junit:target/reports/cucumber.xml","pretty"}
	)
public class TestRunner {

}
