package Factory;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxManager extends DriverManager
{

@Override
protected void initDriver()
{
WebDriverManager.firefoxdriver().setup();
driver = new FirefoxDriver();
	
}//initDriver
	
	
}//FireFoxManager
