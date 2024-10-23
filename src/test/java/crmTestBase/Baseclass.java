package crmTestBase;

import org.testng.annotations.AfterMethod;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass 
{
protected WebDriver driver;
public Logger logger;
public Properties p;
@BeforeClass(groups= {"sanity","master"})
@Parameters({"os","browser"})
public void setup(String os,String br) throws IOException
{
FileReader file = new FileReader(".//src/test/resources/config.properties");
p=new Properties();
p.load(file);
//Loading log4j2file
logger = LogManager.getLogger(this.getClass());
switch(br.toLowerCase())
{
case "chrome":driver = new ChromeDriver();break;
case "safari":driver=new SafariDriver();break;
default: System.out.println("No matching browser.....");
return;
}

driver.manage().deleteAllCookies();
driver.get(p.getProperty("appURL"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
}
public String randomString()
{
String generatedString = RandomStringUtils.randomAlphabetic(3);
return generatedString;
}
public String randomNumber()
{
String generatedString = RandomStringUtils.randomNumeric(10);
return generatedString;
}
public String randomAlphaNumeric()
{
	String str=RandomStringUtils.randomAlphabetic(4);
	String num=RandomStringUtils.randomNumeric(3);
	
	return (str+"@"+num);
}
@AfterMethod
@AfterClass(groups={"sanity","master","regression"})
public void tearDown() 
{
driver.quit();
}
public String captureScreen(String tname) throws IOException {

	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	
	String targetFilePath="/Users/hestabit/eclipse-workspace/icontent/Screenshots" + tname + "_" + timeStamp + ".png";
	File targetFile=new File(targetFilePath);
	
	sourceFile.renameTo(targetFile);
		
	return targetFilePath;


}

}
