package framework_Genric;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class class_data1
{
	public static String fetch_data(String s,int r,int c)
	{
		String value=" ";
		
		try
		{
			FileInputStream fis=new FileInputStream("./Excel/data1.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			value=book.getSheet(s).getRow(r).getCell(c).toString();
		}
		catch (Exception e)
		{
			System.out.println("file not found");
		}
		return value;
	}
}