package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login_refresh_login {

	@Test
	public void login() throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./ScriptWork/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
			pom_class p=new pom_class(driver);
			p.getUsername().sendKeys("9620983661");
			p.getPassword().sendKeys("9620983661@");
			p.getButton().click();
		
}
}