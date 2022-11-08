package framework_Genric;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;

public class Base_test implements framework_constant
{
public static WebDriver driver;
@BeforeMethod
public void open_appn()
{
	System.setProperty("webdriver.gecko.driver","./ScriptWork/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
}

@AfterMethod
public void close_appn(TestResult result) throws InterruptedException, IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		Takescreen.shot(driver);
	}
	Thread.sleep(2000);
	driver.close();
}
}
