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

public class SecondScript {
	public static String getdata(String s,int r, int c)
	{
		String value=" ";
		try
		{
	FileInputStream fis=new FileInputStream("./Excel/Data1.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(s);
	Row row = sheet.getRow(r);
	Cell cell = row.getCell(c);
	 String value1 = cell.toString();
		}
catch(Exception e)
		{
	System.out.println("data not feched");
		}
		return value;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
System.out.println(getdata("Sheet1"  ,0, 0));		
System.out.println(getdata("Sheet1"  ,1, 0));	
	}

}
