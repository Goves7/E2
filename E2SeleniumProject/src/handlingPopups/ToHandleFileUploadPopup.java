package handlingPopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Declaring Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Declaring Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        
		// Launching the Web Application
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(500);
		
		WebElement fileUploadButton = driver.findElement(By.id("uploadfile"));
		
		Actions act = new Actions(driver);
		//act.click(fileUploadButton).perform();
		act.moveToElement(fileUploadButton).click().perform();
		
		Runtime.getRuntime().exec("./autoItPrograms/FileUploadPopup.exe");

	}

}
