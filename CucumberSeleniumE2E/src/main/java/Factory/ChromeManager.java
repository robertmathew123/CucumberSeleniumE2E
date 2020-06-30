package Factory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeManager extends DriverManager
{

@Override
protected void initDriver()
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
	
}//initDriver
	
	
}//ChromeManager
