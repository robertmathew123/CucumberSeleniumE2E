package Utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSingleton 
{




protected String Browser;


public Properties LoadProperties()
{
	
try
{
FileInputStream fiStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\config.properties");
Properties prop = new Properties();
prop.load(fiStream);
return prop;
}//try
catch(Exception e)
{
	
System.out.println("File not found expection thrown for config.properties file.");
return null;

}//catch
	
}//LoadProperties
	
//Instance of the singleton class
private static WebDriverManagerSingleton instanceOfSingletonClass=null;
public WebDriver driver;

//Private Constructor
private WebDriverManagerSingleton()
{
Browser = LoadProperties().getProperty("browser");	
	
if(Browser.equalsIgnoreCase("chrome"))
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}//chrome

else if(Browser.equalsIgnoreCase("firefox"))
{
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
}//firefox

else if(Browser.equalsIgnoreCase("IE"))
{
WebDriverManager.iedriver().setup();  
driver = new InternetExplorerDriver();	
}//IE	

driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
	
}//WebDriverManagerSingleton


//To create the instance of the Class
public static WebDriverManagerSingleton getInstanceOfWebDriverManager()
{
if(instanceOfSingletonClass==null)
{

instanceOfSingletonClass = new WebDriverManagerSingleton();
	
}//null

return instanceOfSingletonClass;
	
}//getInstanceOfWebDriverManager

//TO get the driver
public WebDriver getDriver()
{

	
if(driver==null)
{
	
if(Browser.equalsIgnoreCase("chrome"))
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}//chrome

else if(Browser.equalsIgnoreCase("firefox"))
{
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
}//firefox

else if(Browser.equalsIgnoreCase("IE"))
{
WebDriverManager.iedriver().setup();  
driver = new InternetExplorerDriver();	
}//IE	

driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);	
	
}//driver

return driver;
	
}//getDriver

public void closeDriver()
{
if (!(driver==null))
{	
driver.quit();
driver =null;
}//driver

}//closeDriver
	
	
}//WebDriverManagerSingleton
