package TestNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo  {

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
		Assert.assertEquals(title, "Facebook");
		System.out.println("test case is pass");
		
}
}