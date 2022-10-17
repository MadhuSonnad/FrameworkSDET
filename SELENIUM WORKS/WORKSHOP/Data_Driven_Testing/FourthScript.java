package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FourthScript {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		for (int i = 0; i <= lastrow; i++)
		{
		Row row = sheet.getRow(i);	
		short cellvalue = row.getLastCellNum();
		for (int j = 0; j <=cellvalue-1; j++) 
		{
			Cell cell = row.getCell(j);
			String value = cell.toString();
			System.out.println(value);
		}
		}

	}

}
