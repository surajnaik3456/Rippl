package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/features",
glue= {"stepDefinition","hooks"},
tags="@buildFromScratch",
monochrome = true, 
dryRun = false,
plugin = {
		"pretty",
		"me.jvt.cucumber.report.PrettyReports:target/cucumber"
})
public class TestRunner {
	
}
