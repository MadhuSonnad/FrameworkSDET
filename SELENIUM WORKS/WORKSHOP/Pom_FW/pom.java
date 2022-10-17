package Pom_FW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom 
{
@FindBy (id="email")
private WebElement username;

@FindBy (id="pass")
private WebElement password;

@FindBy (name="login")
private WebElement loginbtn;

public pom(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	
}

public void username(String value1)
{
	username.sendKeys(value1);
}
public void password(String value2)
{
	username.sendKeys(value2);
}

public void loginbutton()
{
	loginbtn.click();
}
}
