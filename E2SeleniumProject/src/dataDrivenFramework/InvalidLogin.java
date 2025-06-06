package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		driver.findElement(By.linkText("Log in")).click();
	
		Flib flib = new Flib();
		int rc = flib.getLastRowCount(EXCEL_PATH, INVALIDCREDS);
		
		for(int i=1; i<=rc; i++)
		{
			String email = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 0);
			Thread.sleep(500);
			
			String password = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 1);
		    Thread.sleep(500);
		    
		    driver.findElement(By.id("Email")).sendKeys(email);
		    Thread.sleep(500);
		    
		    driver.findElement(By.id("Password")).sendKeys(password);
		    Thread.sleep(500);
		    
		    driver.findElement(By.xpath("//input[@value='Log in']")).click();
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("Email")).clear();
		    driver.findElement(By.id("Password")).clear();
		    
		}

	}

}
