package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginUsingExcel extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Creating Object of BaseTest class
		BaseTest bt = new BaseTest();
		bt.browserSetup(); // Using browserSetup() to perform pre-requisites
		
		driver.findElement(By.linkText("Log in")).click();
		
		// Creating the Object of Flib class to access the method to read data from Excel File
		Flib flib = new Flib();
		
		// To Read Email(data) from Excel File
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		
		// To Read Password(data) from Excel File
		String password = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();


	}

}
