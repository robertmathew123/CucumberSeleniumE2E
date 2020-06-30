package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	
public WebDriver driver;

public CheckOutPage(WebDriver driver)
{
		
this.driver = driver;	
		
}//HomePage	


By Bag = By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
By ProceedToCheckOut = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
By ProductName = By.xpath("//table[@class='cartTable']//p[@class='product-name']");


public WebElement getBag()
{

return driver.findElement(Bag);

	
}//getBag

public WebElement getProceedToCheckOut()
{

return driver.findElement(ProceedToCheckOut);

}//getProceedToCheckOut

public WebElement getProductName()
{

return driver.findElement(ProductName);

}//getProductName



}//CheckOutPage
