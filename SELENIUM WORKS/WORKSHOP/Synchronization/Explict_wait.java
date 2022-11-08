package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explict_wait {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./ScriptWork/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("madhu.sonnad@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("MadhuSonnad567");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	WebDriverWait wait =new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleContains("Facebook"));
	String title = driver.getTitle();
	System.out.println(title);
}
}
