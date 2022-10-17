package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitly_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./ScriptWork/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("madhu.sonnad@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("MadhuSonnad567");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
