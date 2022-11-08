package com.crm.SAMPLE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samaplooo 
{
	@Test
	public void method()
	{
		String Browser = System.getProperty("browser");
		System.out.println(Browser);
		
		WebDriver driver;
		 if (Browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();	
			}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();		
		}
		else if(Browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		 
		 String URL=System.getProperty("url");
		 driver.get(URL);
		 
		 String USERNAME=System.getProperty("username");
		 driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		 
		 String PASSWORD=System.getProperty("password");
		 driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		 
		 driver.findElement(By.id("submitButton")).click();
		System.out.println("printed successfuly");
		System.out.println("correct gitHub is pull & puss is pass");
		System.out.println("Result is 100% pass both");
		
		System.out.println("Result is 1000000 both mbjdbjhbcjbjb");
		
		 
	}
	
}
