package Runnner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/testHooksExample.feature",glue={"StepDefinations"})
public class testRunner extends AbstractTestNGCucumberTests  {

}
