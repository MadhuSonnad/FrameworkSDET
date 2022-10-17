package TestNG1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Sample extends Genric
{
@Test
public void login()
{
	
	driver.findElement(By.id("email")).sendKeys("madhu.sonnad@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("MadhuSonnad567");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
}
}
