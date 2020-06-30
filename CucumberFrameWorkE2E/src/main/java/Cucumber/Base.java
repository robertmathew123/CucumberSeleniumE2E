package Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;
import org.apache.commons.io.FileUtils;



public class Base 
{

public static WebDriver driver;
public static String screenshotName;

public static WebDriver getDriver() throws IOException
{

Properties prop = new Properties();
FileInputStream fis = new FileInputStream("H:\\CucumberFrameWorkE2E\\src\\main\\java\\Cucumber\\Global.properties");
prop.load(fis);

System.setProperty("webdriver.chrome.driver", "H://SeleniumJars//ChromeDriver//chromedriver.exe");
driver = new ChromeDriver();
driver.get(prop.getProperty("url"));
driver.manage().window().maximize();
return driver;	

}//getDriver



//*******************************Extent Reports********************************************************************
public static String returnDateStamp(String fileExtension)
{

Date d = new Date();
String date = d.toString().replace(":", "_").replace(" ", "_") + fileExtension;
return date;	
}//returnDateStamp
	
public static void captureScreenShot() throws IOException
{
	
File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
screenshotName = returnDateStamp(".jpg");
FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName));
Reporter.addStepLog("Taking a screenshot!");
Reporter.addStepLog("<br>");
Reporter.addStepLog("<a target=\"_blank\", href="+ returnScreenshotName() + "><image src="+ returnScreenshotName()+ " height=200 width=300></img></a>");

	
}//captureScreenShot

public static String returnScreenshotName()
{
	
return (System.getProperty("user.dir") + "\\output\\imgs\\" + screenshotName).toString();
	
}//returnScreenshotName

private static void copyFileUsingStream(File source, File dest) throws IOException
{

InputStream  is = null;
OutputStream os= null;

try
{

is = new FileInputStream(source);
os = new FileOutputStream(dest);
byte[] buffer = new byte[1024];
int length;

while((length = is.read(buffer)) >0)
{

os.write(buffer, 0, length);
	
}//while
	
}//try
finally
{
is.close();
os.close();
	
}//finally
	
	
}//copyFileUsingStream

public static void copyLatestExtentReport() throws IOException
{
Date d = new Date();
String date = d.toString().replace(":", "_").replace(" ", "_");
File Source = new File(System.getProperty("user.dir") + "\\output\\report.html");
File dest = new File(System.getProperty("user.dir") + "\\output\\" + date.toString() + ".html");
copyFileUsingStream(Source,dest);
	
}//copyLatestExtentReport
	
}//Base
