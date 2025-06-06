package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Declaring Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Declaring Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        
		// Launching the Web Application
		driver.get("https://omayo.blogspot.com/");

		// To get the Alert Popup
		driver.findElement(By.id("alert1")).click();
		
		// To switch the control to Alert Popup
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		
		// To print the Text present in the Popup
		System.out.println(simpleAlert.getText());
		
		// To Click on OK button
		//simpleAlert.accept(); 

		// To Click on OK button
		simpleAlert.dismiss();
	}

}
