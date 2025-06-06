package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Creating object of FileInputStream and Specifying the Path of the File
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");

		// To make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
		// To get into the sheet
		Sheet sheet = wb.getSheet("ipl");
		
		// To get into the row
		Row row = sheet.getRow(5);
		
		// To get into the cell/column
		Cell cell = row.getCell(0);
		
		// To read the data from the cell
		String data = cell.toString();
		
		// To print the data
		System.out.println(data);
	}

}
