package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Declaring Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Declaring Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        
		// Launching the Web Application
		driver.get("https://omayo.blogspot.com/");

		// To get Confirmation Alert Popup
        driver.findElement(By.id("confirm")).click();
 
        // To switch the control to Confirmation Alert Popup
        Alert confirmationAlert = driver.switchTo().alert();
        
        // To get the Text present inside the Popup
        System.out.println(confirmationAlert.getText());
        Thread.sleep(500);
        
        // To accept or click on 'OK' button
        confirmationAlert.accept();
        
		
	}

}
