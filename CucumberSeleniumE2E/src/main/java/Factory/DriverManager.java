package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager 
{

protected WebDriver driver;	
protected abstract void initDriver();

public WebDriver getDriver()
{
initDriver();
return driver;
	
}//getDriver

public void quitDriver()
{

driver.quit();
	
}//quitDriver

public void closeDriver()
{

driver.close();
	
}//closeDriver

public void navigateToDriver(String url)
{

driver.get(url);
	
}//navigateToDriver

public void maximizeBrowser()
{

driver.manage().window().maximize();
	
}//maximizeBrowser

public void setImplicitWaitTimeOut(int timeInMiliSeconds)
{

driver.manage().timeouts().implicitlyWait(timeInMiliSeconds, TimeUnit.MILLISECONDS);
	
}//setImplicitWaitTimeOut

	
	
}//DriverManager
