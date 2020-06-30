package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSimple 
{

public static WebDriver getDriver(String browser)
{

WebDriver driver = null;

if(browser.equalsIgnoreCase("chrome"))
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
return driver;
}//chrome

else if(browser.equalsIgnoreCase("firefox"))
{
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
return driver;
}//firefox

else if(browser.equalsIgnoreCase("IE"))
{
WebDriverManager.iedriver().setup();  
driver = new InternetExplorerDriver();	
return driver;	
}//IE

return driver;
	
}//getDriver
	
	
	
}//WebDriverManagerSimple
