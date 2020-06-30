package stepDefinations;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.Base;

@RunWith(Cucumber.class)
public class stepDefination extends Base {
	

CheckOutPage c;
	
	
@Given("^Validate the browser$")
public void validate_the_browser() throws Throwable 
{
	
System.out.println("Deceding the browser to open");

}//validate_the_browser


@When("^Browser is triggered$")
public void browser_is_triggered() throws Throwable
{
	
System.out.println("Browser is triggered");
	        
}//browser_is_triggered

@Then("^Check if browser is started$")
public void check_if_browser_is_started() throws Throwable 
{

System.out.println("Browser is started");
	
}//check_if_browser_is_started
	
@Given("^User is on Netbanking landing page$")
public void user_is_on_netbanking_landing_page() throws Throwable 
{
  
System.out.println("Navigate to netbanking");
	
}//user_is_on_netbanking_landing_page

@When("^User login into Netbanking with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_login_into_netbanking_with_something_and_something(String UserName, String PassWord) throws Throwable 
{
	
System.out.println(UserName);
System.out.println(PassWord);
        
}//user_login_into_application_with_username_and_password

@Then("^Home page is displayed$")
public void home_page_is_displayed() throws Throwable 
{
 
System.out.println("Display home page");
	
}//home_page_is_displayed

@Then("^Cards are displayed \"([^\"]*)\"$")
public void cards_are_displayed_something(String strArg1) throws Throwable 
{
	
System.out.println(strArg1);
	
}//cards_are_displayed


@When("^User sign up with following details$")
public void user_sign_up_with_following_details(DataTable data) throws Throwable 
{

List<List<String>> obj =  data.raw();
System.out.println(obj.get(0).get(0)); 
System.out.println(obj.get(0).get(1));
System.out.println(obj.get(0).get(2));
System.out.println(obj.get(0).get(3));
System.out.println(obj.get(0).get(4));
    
}//user_sign_up_with_following_details

@When("^User login into application with (.+) and (.+)$")
public void user_login_into_application_with_and(String Username, String Password) throws Throwable 
{
System.out.println(Username);  
System.out.println(Password); 	
	
}//user_login_into_application_with_and

@Then("^Verify selected (.+) items are displayed in Check out page$")
public void verify_selected_items_are_displayed_in_check_out_page(String fruitname) throws Throwable
{
WebDriverWait wait = new WebDriverWait(driver, 10);
c = new CheckOutPage(driver);
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='cartTable']//p[@class='product-name']")));
System.out.println(c.getProductName().getText());
Assert.assertTrue(c.getProductName().getText().contains(fruitname));
    
}//verify_selected_something_items_are_displayed_in_check_out_page

}//stepDefination
