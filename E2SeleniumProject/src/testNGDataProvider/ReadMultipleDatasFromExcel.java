package testNGDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDatasFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		int rowCount = sheet.getPhysicalNumberOfRows()-1;
		int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
		
	    String [][] arr = new String [rowCount][cellCount];
		
	    for(int i=1; i<=rowCount; i++)
	    {
	    	for(int j=0; j<cellCount; j++)
	    	{
	    		arr [i-1][j]=sheet.getRow(i).getCell(j).toString();
	    	}
	    }
	    
	    for(String [] sarr :arr)
	    {
	    	for(String data : sarr)
	    	{
	    		System.out.print(data+", ");
	    	}
	    	System.out.println();
	    }

	}

}
