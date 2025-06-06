package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginUsingProperty extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Creating Object of BaseTest class
		BaseTest bt = new BaseTest();
		bt.browserSetup(); // Using browserSetup() to perform pre-requisites

		driver.findElement(By.linkText("Log in")).click();

		// Creating object of Flib class to access the NSMs
		Flib flib = new Flib();

		// Fetching email(data) from Property File using readPropertyData method from
		// Flib Class
		String email = flib.readPropertyData(PROP_PATH, "email");

		// Fetching password(data) from Property File using readPropertyData method from
		// Flib Class
		String password = flib.readPropertyData(PROP_PATH, "password");

		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);

		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
