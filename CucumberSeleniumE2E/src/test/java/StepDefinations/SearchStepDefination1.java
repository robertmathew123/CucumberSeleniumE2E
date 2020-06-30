package StepDefinations;

import Context.TestContextUI;
import cucumber.api.java.en.When;

public class SearchStepDefination1 
{

TestContextUI testContextU;
	
public SearchStepDefination1(TestContextUI testContextUI)
{
		
this.testContextU = testContextUI;

}//SearchStepDefination1
	
@When("^I search for product as \"([^\"]*)\"$")
public void i_search_for_product_as_something(String Product) throws Throwable
{
testContextU.getCmnPageObj().SetSearchTextBox(Product);
testContextU.getCmnPageObj().ClickOnSearchButton();
}//i_search_for_product_as_something	
	
	
}//SearchStepDefination1
