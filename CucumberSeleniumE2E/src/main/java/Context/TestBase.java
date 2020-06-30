package Context;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class TestBase 
{

protected String url = LoadProperties().getProperty("url");

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
	
}//TestBase
