package stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// CucumberJava/
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"stepdefinitions"},
monochrome = true, plugin = {"pretty", "html:target/HtmlReports", "json:target/JSONReports/report.json", 
		"junit:target/XMLReports/report.xml"}, tags = "@smoketest")
public class TestRunnerClass {

}
