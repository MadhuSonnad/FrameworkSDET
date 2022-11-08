package framework_Genric;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreen 
{
public static void shot(WebDriver driver) throws IOException
{
	TakesScreenshot tss=(TakesScreenshot)driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File dst=new File("./screenshot/a1.png");
	FileUtils.copyFile(src, dst);
}
}
