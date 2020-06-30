package StepDefinations;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Context.TestBase;
import Context.TestContextUI;
import Factory.DriverFactory;
import Factory.DriverManager;
import Utils.WebDriverManagerSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class SearchStepDefination extends TestBase 
{

TestContextUI testContextUI;
Scenario scn;
String productClickedTextExpected;
	
public SearchStepDefination(TestContextUI testContextUI)
{
	
this.testContextUI = testContextUI;

}//SearchStepDefination


@Given("^I have browser opened and url is navigated$")
public void i_have_browser_opened_and_url_is_navigated() throws Throwable 
{
//***********************************Normal Method 1st***************************************
/*WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);*/

//**********************************Encapsulation Method 2nd***************************************
/*WebDriver driver = WebDriverManagerSimple.getDriver("chrome");
driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);*/
 
//**********************************Singleton Method 3rd***************************************
//WebDriver driver =WebDriverManagerSingleton.getInstanceOfWebDriverManager().getDriver();

//**********************************Factory design Method***************************************
DriverManager driverManager = DriverFactory.getDriverManager("chrome");
WebDriver driver = driverManager.getDriver();	

driver.get(url);
driver.manage().window().maximize();
scn.write("Chrome Driver invoked and URL Navigated as: " + url);
testContextUI.setDriver(driver);
testContextUI.intitializePageObject(driver,scn);
}//i_have_browser_opened_and_url_is_navigated

@Then("^Product list should appear pertaining to the product search as \"([^\"]*)\"$")
public void product_list_should_appear_pertaining_to_the_product_search_as_something(String productName) throws Throwable 
{
testContextUI.getSeaPageObj().ValidateProductList(productName);
}//product_list_should_appear_pertaining_to_the_product_search_as_something	


@When("I click on Hamburger menu")
public void i_click_on_Hamburger_menu() 
{
	
testContextUI.getCmnPageObj().ClickOnHamburgerMenuButton(); 
	
}//i_click_on_Hamburger_menu

@When("I click on Hamburger menu with category as {string}")
public void i_click_on_Hamburger_menu_with_category_as(String Category) 
{
	
testContextUI.getCmnPageObj().ClickOnHamburgerMenuProductCategoryLink(Category);
	
}//i_click_on_Hamburger_menu_with_category_as

@When("I click on Hamburger menu with sub category as {string}")
public void i_click_on_Hamburger_menu_with_sub_category_as(String SubCategory) 
{
 
testContextUI.getCmnPageObj().ClickOnHamburgerMenuProductSubCategoryLink(SubCategory);
	
}//i_click_on_Hamburger_menu_with_sub_category_as

@Then("Search results are displayed for product related to {string}")
public void search_results_are_displayed_for_product_related_to(String expectedTitle) 
{
  
testContextUI.getCmnPageObj().ValidatePageTitleMatch(expectedTitle);
	
}//search_results_are_displayed_for_product_related_to

@When("I click on any product in the Search result")
public void i_click_on_any_product_in_the_Search_result() 
{
	
productClickedTextExpected = testContextUI.getSeaPageObj().ClickOnProductLink();	
	
}//i_click_on_any_product_in_the_Search_result

@Then("I am able to see product description and details in new tab")
public void i_am_able_to_see_product_description_and_details_in_new_tab() 
{
testContextUI.getproductDescriptionObjects().switchToWindowTab("1");
testContextUI.getproductDescriptionObjects().ValidateProductDescriptionHeader(productClickedTextExpected);
testContextUI.getproductDescriptionObjects().switchToWindowTab("0");
}//i_am_able_to_see_product_description_and_details_in_new_tab

@Before
public void SetUp(Scenario s)
{

this.scn = s;
	
}//SetUp

@AfterStep
public void AfterEachLine()
{
/*TakesScreenshot scrnShot = ((TakesScreenshot)driver);
byte[] data= scrnShot.getScreenshotAs(OutputType.BYTES);
scn.embed(data,"image/png");*/	
}//AfterEachLine


@After
public void CleanUp(Scenario s)
{
	
if(s.isFailed())
{
TakesScreenshot scrnShot = ((TakesScreenshot)testContextUI.getDriver());
byte[] data= scrnShot.getScreenshotAs(OutputType.BYTES);
scn.embed(data,"image/png");
}//s.isFailed

testContextUI.getDriver().quit();
scn.write("Browser is Closed");
	
}//CleanUp


}//SearchStepDefination





