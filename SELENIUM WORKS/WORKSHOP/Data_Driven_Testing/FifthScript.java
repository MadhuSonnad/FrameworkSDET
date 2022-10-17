package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FifthScript {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.gecko.driver","./ScriptWork/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		int count = link.size();
     FileInputStream fis = new FileInputStream("./Excel/Book1.xlsx");
     Workbook book = WorkbookFactory.create(fis);
     Sheet sheet = book.getSheet("Sheet1");
     for (int i = 0; i<count; i++) 
     {
	Row row = sheet.createRow(i);
	Cell cell = row.createCell(0);
	cell.setCellValue(link.get(i).getAttribute("href"));
	}
       FileOutputStream fos=new FileOutputStream("./Excel/Book1.xlsx");
       book.write(fos);
	}

}
