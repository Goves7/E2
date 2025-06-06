package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Creating the object of FileInputStream and specifying the path of the File
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		//To make the File Ready to Read
		Workbook wb = WorkbookFactory.create(fis);
		
		// To get into the sheet
		Sheet sheet = wb.getSheet("ipl");
		
		// To create a new row Virtually
		Row row = sheet.createRow(11);
		
		// To create a new cell Virtually
		Cell cell = row.createCell(0);
		
		// To set a value for the cell
		cell.setCellValue("PUNE");
		
		// To write the data in the Specified File
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);

	}

}
