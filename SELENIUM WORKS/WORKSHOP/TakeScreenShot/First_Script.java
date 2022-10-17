package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_Script {
public static void main(String[] args) throws IOException 
{
	System.setProperty("webdriver.gecko.driver","./ScriptWork/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com");
	
	TakesScreenshot tss = (TakesScreenshot)driver;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dst=new File("./ScreenShot/a1.png");
	FileUtils.copyFile(src, dst);
}
}
