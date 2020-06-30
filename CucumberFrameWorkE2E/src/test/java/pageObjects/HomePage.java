package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{

public WebDriver driver;

public HomePage(WebDriver driver)
{
	
this.driver = driver;	
	
}//HomePage

By Search = By.xpath("//input[@class='search-keyword']");
By ItemName = By.xpath("//div[@class='product']//h4[@class='product-name']");
By AddButton = By.xpath("//div[@class='stepper-input']//a[@class='increment']");
By AddToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");

public WebElement getSearch()
{

return driver.findElement(Search);

	
}//getSearch

public WebElement getItemName()
{

return driver.findElement(ItemName);

	
}//getItemName

public WebElement getAddButton()
{

return driver.findElement(AddButton);

	
}//AddButton

public WebElement getAddToCart()
{

return driver.findElement(AddToCart);

	
}//AddToCart
	
	
}//HomePage
