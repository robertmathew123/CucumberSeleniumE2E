package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features",
glue = "StepDefinations",
tags ="@TC0008",
monochrome = true,

dryRun=false,
plugin= {"pretty",
		"html:target/html/",
		"json:target/json/file.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


)

public class RunTest 
{

	
	
	
}//RunTest
