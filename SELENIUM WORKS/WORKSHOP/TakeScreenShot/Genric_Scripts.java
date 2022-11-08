package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Genric_Scripts {
public static void captureshot(WebDriver driver) throws IOException
{
	String path = "./ScreenShot/";
	
	Date d=new Date();
	String d1 = d.toString();
	String date = d1.replaceAll(":", "-");
	TakesScreenshot tss = (TakesScreenshot)driver;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dst = new File(path+date+".png");
	FileUtils.copyFile(src, dst);
}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","./ScriptWork/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		captureshot(driver);
		Thread.sleep(2000);
		captureshot(driver);
		Thread.sleep(2000);
		captureshot(driver);
		Thread.sleep(2000);
		captureshot(driver);
		

	}

}
