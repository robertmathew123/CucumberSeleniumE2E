package Factory;

public class DriverFactory 
{

public static DriverManager getDriverManager(String browserType) throws Exception 
{

DriverManager  driverManager;

switch(browserType.toLowerCase())
{

case "chrome":
driverManager = new ChromeManager();
break;


case "firefox":
driverManager = new FireFoxManager();
break;

case "ie":
driverManager = new IEManager();
break;

default:
throw new Exception("No such browser is present to be initalize. Browser name: " + browserType);


}//switch

return driverManager;
	
}//getDriverManager


	
}//DriverFactory
