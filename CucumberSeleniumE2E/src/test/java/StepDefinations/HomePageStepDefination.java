package StepDefinations;

import java.util.List;

import Context.TestContextUI;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;

public class HomePageStepDefination 
{
	

TestContextUI testContextU;
Scenario scn;
	
public HomePageStepDefination(TestContextUI testContextUI)
{
			
this.testContextU = testContextUI;

}//HomePageStepDefination	
	
@Then("^Below Header links are displayed$")
public void below_header_links_are_displayed(List<String> list) throws Throwable 
{

for(int i=0; i<list.size();i++)
{

try
{

testContextU.getCmnPageObj().ValidateElementPresentInHeader(list.get(i));	

}//try
catch(Exception e)
{

scn.write("Exception thrown: " +e.getMessage());	
	
}//e
	
	
}//for
	   
}//below_header_links_are_displayed

}//HomePageStepDefination
