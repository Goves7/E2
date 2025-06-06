package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDatasFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
       
		FileInputStream fis1 = new FileInputStream("./data/TestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb1.getSheet("ipl");
		int rc = sheet1.getLastRowNum();
		System.out.println(rc);
        
		
		for(int i=1; i<=rc; i++)
        {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("ipl");
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(0);
		String data = cell.toString();
		System.out.println(data);
        Thread.sleep(1000);
        }
	}

}
