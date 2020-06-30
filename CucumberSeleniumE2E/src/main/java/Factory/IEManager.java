package Factory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEManager extends DriverManager
{

@Override
protected void initDriver()
{
WebDriverManager.iedriver().setup();  
driver = new InternetExplorerDriver();	
	
}//initDriver
	
	
}//IEManager
