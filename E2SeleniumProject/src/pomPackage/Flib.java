package pomPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelPath,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// To specify the path of Excel File
		Workbook wb = WorkbookFactory.create(fis); // To make the File ready to Read
		Sheet sheet = wb.getSheet(sheetName); // To get into the Sheet
		Row row = sheet.getRow(rowNo); // To get into the Row
		Cell cell = row.getCell(cellNo); // To get into the Cell
		String data = cell.toString(); // To Fetch the data from the cell
		return data; // To return the fetched data back to the calling method
	}
	
	public String readPropertyData(String propPath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath); // To specify the path of Property File
		Properties prop = new Properties(); // Creating object of Properties class to access NSMs
		prop.load(fis); // To make the File ready to Read
		String data = prop.getProperty(key); // To Fetch the data assigned to the Key
		return data; // To return the fetched data back to the calling method
		
	}
	
	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// To specify the path of Excel File
		Workbook wb = WorkbookFactory.create(fis); // To make the File ready to Read
		Sheet sheet = wb.getSheet(sheetName); // To get into the Sheet
		int rc = sheet.getLastRowNum(); // To get the no. of rows present in the sheet
		return rc;
	}
	
	public String readNumericExcelData(String excelPath,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// To specify the path of Excel File
		Workbook wb = WorkbookFactory.create(fis); // To make the File ready to Read
		Sheet sheet = wb.getSheet(sheetName); // To get into the Sheet
		Row row = sheet.getRow(rowNo); // To get into the Row
		Cell cell = row.getCell(cellNo); // To get into the Cell
		long data = (long) cell.getNumericCellValue(); // Reading the Numeric Value from the cell
		
		String data1 = String.valueOf(data); // Converting long type of data into String
		return data1;  

	}
	
}
