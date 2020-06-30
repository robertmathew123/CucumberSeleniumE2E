package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Interact;
import cucumber.api.Scenario;



public class CommonPageObj extends Interact 
{
private static final Logger logger = LogManager.getLogger(Interact.class);
Scenario scn;

private By search_text_box = By.xpath("//input[@id='twotabsearchtextbox']");
private By search_button = By.xpath("//input[@value='Go']");
private By hamburger_menu_link = By.xpath("//a[@id='nav-hamburger-menu']");
private By nav_link_logo =By.xpath("//a[@class='nav-logo-link']");
private By nav_link_account =By.xpath("//a[@id='nav-link-accountList']");
private By nav_link_orders =By.xpath("//a[@id='nav-orders']");
private By nav_link_prime =By.xpath("//a[@id='nav-link-prime']");
private By nav_link_cart =By.xpath("//a[@id='nav-cart']");

private String hamburger_menu_category_link_xpath = "//div[@id='hmenu-container']//div[text()='%s']";
private String hamburger_menu_sub_category_link_xpath = "//div[@id='hmenu-container']//a[text()='%s']";


public CommonPageObj(WebDriver driver,Scenario s)
{

setDriver(driver);
this.scn = s;
		
}//SearchPageObj

public void SetSearchTextBox(String text)
{
setElement(search_text_box,text);
byte[] data = takeScreenShot(search_text_box);
scn.embed(data,"image/png");
		
}//SetSearchTextBox

public void ClickOnSearchButton()
{

clickElement(search_button);
		
}//ClickOnSearchButton


public void ClickOnHamburgerMenuButton()
{

clickElement(hamburger_menu_link);
scn.write("Clicked on Hamburger Menu Link");
logger.info("Clicked on Hamburger Menu Button");		
}//ClickOnHamburgerMenuButton

public void ClickOnHamburgerMenuProductCategoryLink(String linkText)
{
By byElement = By.xpath(String.format(hamburger_menu_category_link_xpath, linkText));
clickElement(byElement);
scn.write("Clicked on Hamburger Menu Category Link: " + linkText);
logger.info("Clicked on Hamburger Menu Category Link: " + linkText);	

}//ClickOnHamburgerMenuProductCategoryLink

public void ClickOnHamburgerMenuProductSubCategoryLink(String linkText)
{
By byElement = By.xpath(String.format(hamburger_menu_sub_category_link_xpath, linkText));
clickElement(byElement);
scn.write("Clicked on Hamburger Menu SubCategory Link: " + linkText);
logger.info("Clicked on Hamburger Menu SubCategory Link: " + linkText);	

}//ClickOnHamburgerMenuProductSubCategoryLink

public void ValidatePageTitleMatch(String expectedTitle)
{
WebDriverWait wait = new WebDriverWait(getDriver(),30);
boolean b = wait.until(ExpectedConditions.titleContains(expectedTitle));
Assert.assertTrue(b);
scn.write("Page title Matched: "+ expectedTitle);
logger.info("Page title Matched: "+ expectedTitle);
}//ValidatePageTitleMatch


public void ValidateElementPresentInHeader(String text) throws Exception
{
boolean b = false;

switch(text.toLowerCase().trim())
{
case "hamburger menu":
b = validateElementIsDisplayed(hamburger_menu_link);
break;

case "amazon prime logo":
b = validateElementIsDisplayed(nav_link_logo);
break;

case "accounts and list link":
b = validateElementIsDisplayed(nav_link_account);
break;

case "return and orders":
b = validateElementIsDisplayed(nav_link_orders);
break;

case "your prime link":
b = validateElementIsDisplayed(nav_link_prime);
break;

case "cart link":
b = validateElementIsDisplayed(nav_link_cart);
break;

case "search text box":
b = validateElementIsDisplayed(search_text_box);
break;

default:
logger.fatal("Header link description is not present in the case. Please add the link description first");
scn.write("Header Link Description is not present in the case. Please add the link description first");
throw new Exception("Header Link Description is not present in the case. Please add the link description first");

}//switch

if(b)
{
scn.write("Header link is displayed: " + text);
Assert.assertTrue(b);	
}//b
else
{
scn.write("Header link is not displayed: " + text);
Assert.assertFalse(b);
}//else


	
}//ValidateElementPresentInHeader
	

}//HomePageObj
