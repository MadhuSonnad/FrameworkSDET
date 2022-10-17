package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genric {
WebDriver driver;
@BeforeMethod
public void OpenApplication()
{
	System.setProperty("webdriver.gecko.driver","./ScriptWork/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
}
@AfterMethod
public void CloseApplication() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
}
}
