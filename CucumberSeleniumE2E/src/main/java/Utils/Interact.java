package Utils;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Interact 
{

private static final Logger logger = LogManager.getLogger(Interact.class);
private WebDriver driver;

public WebDriver getDriver()
{


return driver;
	
}//getDriver

public void setDriver(WebDriver d)
{

this.driver = d;

}//setDriver

public WebElement clickElement(By by)
{
WebDriverWait wait = new WebDriverWait(driver,60);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));	
element.click();
logger.info("Element is clicked. Element Description: "+ by.toString());
return element;

}//clickElement

public void clickElement(WebElement webElement)
{
WebDriverWait wait = new WebDriverWait(driver,60);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));	
webElement.click();
logger.info("Element is clicked. Element Description: "+ webElement.toString());
}//clickElement

public WebElement setElement(By by,String text)
{
WebDriverWait wait = new WebDriverWait(driver,60);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));	
element.sendKeys(text);
logger.info("Element is set with text as: "+text+ ". Element Description: "+ by.toString());
return element;

}//clickElement

public String getAttribute(By by,String attName)
{
WebDriverWait wait = new WebDriverWait(driver,60);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));	
String value = element.getAttribute(attName);
logger.info("Get Attribute for element: "+ by.toString()+ " Attribute Name: "+ attName);
return value;

}//getAttribute

public String getText(By by)
{
WebDriverWait wait = new WebDriverWait(driver,60);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));	
String value = element.getText();
logger.info("Get Text for element: "+ by.toString()+ " Text "+ value);
return value;
}//getText

public boolean validateElementIsDisplayed(By by)
{
WebDriverWait wait = new WebDriverWait(driver,60);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));	
boolean b =getDriver().findElement(by).isDisplayed();
logger.info("Element is displayed status: " + by.toString());
return b;
}//validateElementIsDisplayed

public List<WebElement> getListOfWebElements(By by)
{
WebDriverWait wait = new WebDriverWait(driver,60);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
logger.info("List of Elements returned for description: "+ by.toString());
return element.findElements(by);

}//getListOfWebElements

public void switchToWindowTab(String WindowId)
{
Set<String> id  = driver.getWindowHandles();
//iterator will iterate through each steps in the set
Iterator<String>  it = id.iterator();
String PId   =    it.next();
String CId   =    it.next();

if(WindowId.equalsIgnoreCase("0")) 
{
driver.switchTo().window(PId);		
}//if
else if(WindowId.equalsIgnoreCase("1")) 
{
driver.switchTo().window(CId);		
}//else
logger.info("Browser Switched to window tab.");
}//switchToSecondWindowTab

public byte[] takeScreenShot()
{
TakesScreenshot Shot = ((TakesScreenshot)driver);
logger.info("Screen Shot taken for full driver. ");
return Shot.getScreenshotAs(OutputType.BYTES);

}//takeScreenShot

public byte[] takeScreenShot(By by)
{
TakesScreenshot Shot = ((TakesScreenshot)driver.findElement(by));
logger.info("Screen Shot taken for element: "+ by.toString());
return Shot.getScreenshotAs(OutputType.BYTES);

}//takeScreenShot

public File takeScreenShotAsFile()
{
TakesScreenshot Shot = ((TakesScreenshot)driver);
logger.info("Screen Shot taken for full driver and returned as file. ");
return Shot.getScreenshotAs(OutputType.FILE);

}//takeScreenShotAsFile

public File takeScreenShotAsFile(By by)
{
TakesScreenshot Shot = ((TakesScreenshot)driver.findElement(by));
logger.info("Screen Shot taken for full driver and returned as file. By descp: "+ by.toString());
return Shot.getScreenshotAs(OutputType.FILE);

}//takeScreenShotAsFile
	
	
	
}//Interact
