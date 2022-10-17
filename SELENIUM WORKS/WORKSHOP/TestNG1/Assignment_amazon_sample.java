package TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_amazon_sample extends Assignment_amazon_genric{
	@Test
	public void login() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("9620983661");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("madhusonnad");
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(20000);
	}
}