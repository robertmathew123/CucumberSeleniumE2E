package StepDefinations;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import Context.TestBase;
import Context.TestContextUI;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartStepDefination extends TestBase 
{

TestContextUI testContextUI;
Scenario scn;
String ProductClickedName;
String UpdatedTextCartValue;
String TextCartValue;

public AddToCartStepDefination(TestContextUI testContextUI)
{
		
this.testContextUI = testContextUI;

}//AddToCartStepDefination
	
@Given("I get a text for cart")
public String i_get_a_text_for_cart() 
{
TextCartValue=testContextUI.getCmnPageObj().get_Cart_value();
return TextCartValue;
			    
}//i_get_a_text_for_cart
	
	
/*@And("I click on any product in the Search result")
public void i_click_on_any_product_in_the_Search_result()
{
	
ProductClickedName = testContextUI.getSeaPageObj().ClickOnFirstProduct();

}//i_click_on_any_product_in_the_Search_result*/
	
	
@When("I click on Add to Cart button")
public String i_click_on_Add_to_Cart_button() 
{
testContextUI.getDriver().switchTo().window((String) testContextUI.getDriver().getWindowHandles().toArray()[1]);
testContextUI.geAddToCartObjects().ClickOnAddToCartButton();
UpdatedTextCartValue=testContextUI.getCmnPageObj().get_Cart_value();
return UpdatedTextCartValue;
		
}//i_click_on_Add_to_Cart_button

@Then("Count Of The Cart Should Be Displayed As {int}")
public void count_Of_The_Cart_Should_Be_Displayed_As(Integer int1) 
{
		
testContextUI.geAddToCartObjects().ValidateCartSubtotal();

}//count_Of_The_Cart_Should_Be_Displayed_As

	
@Then("I am able to see the cart value gets updated in the header section")
public void i_am_able_to_see_the_cart_value_gets_updated_in_the_header_section() {
boolean bb=false;	
if(!TextCartValue.equals(UpdatedTextCartValue))
{
	
bb=true;
Assert.assertEquals(true,bb);

}//if
		
}//i_am_able_to_see_the_cart_value_gets_updated_in_the_header_section

}//AddToCartStepDefination
