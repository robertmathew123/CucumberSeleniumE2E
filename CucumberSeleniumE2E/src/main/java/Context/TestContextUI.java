package Context;

import org.openqa.selenium.WebDriver;

import PageObjects.*;
import cucumber.api.Scenario;




public class TestContextUI 
{

private WebDriver driver;
private CommonPageObj cmnPageObj;
private SearchPageObj seaPageObj;
private ProductDescriptionObjects productDescriptionObjects;

public WebDriver getDriver() 
{
	
return driver;

}//getDriver

public void setDriver(WebDriver driver) 
{
	
this.driver = driver;

}//setDriver

public CommonPageObj getCmnPageObj() 
{
	
return cmnPageObj;
	
}//getCmnPageObj

public SearchPageObj getSeaPageObj() 
{
	
return seaPageObj;
	
}//getSeaPageObj

public ProductDescriptionObjects getproductDescriptionObjects() 
{
	
return productDescriptionObjects;
	
}//getproductDescriptionObjects

public void intitializePageObject(WebDriver driver,Scenario s)
{
cmnPageObj = new CommonPageObj(driver,s);
seaPageObj = new SearchPageObj(driver,s);
productDescriptionObjects = new ProductDescriptionObjects(driver,s);
	
}//intitializePageObject

	
}//TestContextUI
