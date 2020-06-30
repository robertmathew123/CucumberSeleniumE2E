package stepDefinations;



import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import Cucumber.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base 
{
	


@Before("@MobileTest")
public void BeforeMobileValidation()
{
	
System.out.println("Before Mobile Hook");
		
}//BeforeValidation
	
@After("@MobileTest")
public void AfterMobileValidation()
{
	
System.out.println("After Mobile Hook");
		
}//AfterValidation

@Before("@WebTest")
public void BeforeWebValidation()
{
	
System.out.println("Before Web Hook");
		
}//BeforeWebValidation
	
@After("@WebTest")
public void AfterWebValidation()
{
	
System.out.println("After Web Hook");
		
}//AfterWebValidation	

@After("@SmokeTest")
public void AfterSeleniumTest()
{
	
//driver.close();
		
}//AfterSeleniumTest	


@After("@RegressionTest")
public void AfterSeleniumTest1()
{
	
//driver.close();
		
}//AfterSeleniumTest1

@After
public void ScreenShotOnFailure(Scenario scenario ) throws IOException
{
Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "\\src\\main\\java\\utils\\ReportsConfig.xml"));		
try
{

if(driver !=null && scenario.isFailed())
{
scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
Base.captureScreenShot();
driver.manage().deleteAllCookies();
driver.quit();
driver = null;

}//scenario.isFailed

if(driver !=null)
{
driver.manage().deleteAllCookies();
driver.quit();
driver = null;
}//null
	
	
}//try

catch(Exception e)
{
	
System.out.println("Methods failed: ScreenShotOnFailure, Expection" + e.getLocalizedMessage());	
	
	
}//e
	
	
}//ScreenShotOnFailure


}//Hooks
