package Runnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class testRunnerBackground {

	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/feature/demoBackground/testBackground.feature",glue={"StepDefinations"})
	public class testRunner extends AbstractTestNGCucumberTests  {
	
	}
	
}
