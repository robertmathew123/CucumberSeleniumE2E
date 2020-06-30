package stepDefinations;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import Cucumber.Base;


@RunWith(Cucumber.class)
public class stepDefinationGreenKart 
{

WebDriver driver;
HomePage h;	
CheckOutPage c;
	
@Given("^User is on GreenKart Landing page$")
public void user_is_on_greenkart_landing_page() throws Throwable 
{
driver = Base.getDriver();
Reporter.addStepLog("User is on GreenKart Landing page");
	
}//user_is_on_greenkart_landing_page

@When("^User search for \"([^\"]*)\" Vegetable$")
public void user_search_for_something_vegetable(String strArg1) throws Throwable 
{
Reporter.addStepLog("User search for " +strArg1+" Vegetable");
h = new HomePage(driver);
h.getSearch().sendKeys(strArg1);
Thread.sleep(3000L);
}//user_search_for_something_vegetable

@Then("^\"([^\"]*)\" results are displayed$")
public void something_results_are_displayed(String strArg1) throws Throwable 
{
Reporter.addStepLog( strArg1+ " results are displayed");
h = new HomePage(driver);	
System.out.println(h.getItemName().getText());
Assert.assertTrue(h.getItemName().getText().contains(strArg1));
        
}//something_results_are_displayed


@And("^Add items to cart$")
public void add_items_to_cart() throws Throwable 
{
Reporter.addStepLog("Add items to cart");
h = new HomePage(driver);
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='stepper-input']//a[@class='increment']")));
h.getAddButton().click();
h.getAddToCart().click();
}//add_items_to_cart

@And("^User proceeded to Checkout page for purchase$")
public void user_proceeded_to_checkout_page_for_purchase() throws Throwable 
{
Reporter.addStepLog("User proceeded to Checkout page for purchase");
c = new CheckOutPage(driver);	
c.getBag().click();
c.getProceedToCheckOut().click();

}//user_proceeded_to_checkout_page_for_purchase


@When("^User search for (.+) Vegetables$")
public void user_search_for_vegetables(String fruitname) throws Throwable 
{
Reporter.addStepLog("User search for " +fruitname);
h = new HomePage(driver);
h.getSearch().sendKeys(fruitname);
Thread.sleep(3000L);    
}//user_search_for_vegetables

@Then("^(.+) Fruit results are displayed$")
public void fruit_results_are_displayed(String fruitname) throws Throwable 
{
Reporter.addStepLog(fruitname+ " Fruit results are displayed");
h = new HomePage(driver);	
System.out.println(h.getItemName().getText());
Assert.assertTrue(h.getItemName().getText().contains(fruitname));   
}//fruit_results_are_displayed



}//stepDefinationGreenKart