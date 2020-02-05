package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Testutill {
	
	public WebDriver driver;
	static String filepath = "./Testdata/testdata.xlsx";
	static Workbook wb;
	static Sheet sheet;
	
	public void swichtoframe(String ele)
	{
		driver.switchTo().frame(ele);
	}
	
	public static Object[][] getestdata(String sheetname)
	{
		FileInputStream file= null;
		try
		{
			file = new FileInputStream(filepath);
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
		wb= WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e) {
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		sheet = wb.getSheet(sheetname);
		Object data [][]= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0; i<sheet.getLastRowNum(); i++)
		{
			for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j);
			}
		}
	return data;	
	}

	

}
