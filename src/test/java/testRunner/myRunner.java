package testRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features ="Features",
glue = {"myStepDefinition"}
//tags  = "@dish"

)
public class myRunner extends AbstractTestNGCucumberTests {
	
	
	
	
 
}
