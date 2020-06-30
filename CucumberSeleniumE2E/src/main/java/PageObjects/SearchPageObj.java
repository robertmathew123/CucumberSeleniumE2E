package PageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Utils.Interact;
import cucumber.api.Scenario;
import junit.framework.Assert;

public class SearchPageObj extends Interact 
{

Scenario scn;

private By product_list = By.xpath("//span[contains(text(),'DELL')]");
private By product_list_all = By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//span[@class='a-size-medium a-color-base a-text-normal']");


public SearchPageObj(WebDriver driver,Scenario s)
{

setDriver(driver);
this.scn = s;
		
}//SearchPageObj


public String ClickOnProductLink()
{
List<WebElement> list = getListOfWebElements(product_list_all);	
clickElement(list.get(0));
scn.write("Clicked on the First Product Link");	
return list.get(0).getText();
}//ClickOnProductLink

public String ClickOnProductLink(int productLink)
{
List<WebElement> list = getListOfWebElements(product_list_all);	
clickElement(list.get(productLink));
scn.write("Clicked on Product id: " + productLink + " Product Link");
return list.get(productLink).getText();
}//ClickOnProductLink

public String ClickOnProductLink(String productTextContains)
{
List<WebElement> list = getListOfWebElements(product_list_all);	
boolean flag = true;
int counter=0;
for(int i=0;i<list.size();i++)
{
	
if(list.get(i).getText().contains(productTextContains))
{

clickElement(list.get(i));
counter =i;
flag = true;
break;

}//if
	
}//for
	
if(flag)
{
scn.write("Clicked on Product containing text as: " + productTextContains + "");	
}//flag
else
{
scn.write("Unable to Click on Product containing text as: " + productTextContains + " No product found with metioned text");
Assert.assertFalse("Unable to Click on Product containing text as: " + productTextContains + " No product found with metioned text", true);

}//else

return list.get(counter).getText();

}//ClickOnProductLink

public void ValidateProductList(String productName)
{

List<WebElement> list_product =  getListOfWebElements(product_list);

for(int i=0;i<list_product.size();i++)
{

String elementText = list_product.get(i).getText().toLowerCase();

if(elementText.contains(productName.toLowerCase()))
{
Assert.assertTrue(true);	

}//if

else
{
	
Assert.fail("Product not correctly displayed in the search result");	

}//else
	
}//for


}//ValidateProductList

			


}//SearchPageObj
