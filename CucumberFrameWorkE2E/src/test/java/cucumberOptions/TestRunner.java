package cucumberOptions;
import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import Cucumber.Base;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features",
glue = "stepDefinations",
tags ="@SmokeTest",
//tags ="@WebTest,@MobileTest,@PortalTest",
//dryRun = true,
monochrome = true,
strict = true,
plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})


public class TestRunner 
{

@AfterClass
public static void AfterClassTest() throws IOException
{
	
Base.copyLatestExtentReport();	
	
}//AfterClassTest
	
	
	
}//TestRunner
