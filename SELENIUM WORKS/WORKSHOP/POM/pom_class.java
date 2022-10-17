package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class
{
	@FindBy(xpath="//input[@id='email']")
	private WebElement usr;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement psd;
	@FindBy(xpath="//button[.='Log In']")
	private WebElement btn;


public pom_class(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

	public WebElement getUsername()
	{
		return usr;
		
	}
	
	public WebElement getPassword()
	{
		return psd;
	}
	
	public WebElement getButton()
	{
		return btn;
	}
}

