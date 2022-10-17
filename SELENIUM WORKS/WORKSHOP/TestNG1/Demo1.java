package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 {

	@Test
	public void login()
	{

		System.setProperty("webdriver.gecko.driver","./ScriptWork/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("madhu.sonnad@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("MadhuSonnad567");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String title=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "Facebook");
		System.out.println("test case is pass");
		driver.findElement(By.xpath("//span[.='Friends']")).click();
		s.assertAll();

	}

}
