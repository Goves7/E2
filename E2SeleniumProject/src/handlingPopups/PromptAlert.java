package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Declaring Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Declaring Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        
		// Launching the Web Application
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");

		// To get a Prompt Alert popup
		driver.findElement(By.id("buttonAlert1")).click();		
		
		// To switch the control to Propmpt Alert Popup
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(500);
		
		// To get the text present inside Prompt Alert popup
		System.out.println(promptAlert.getText());
		Thread.sleep(500);
		
		// To pass inputs to the textbox present inside the popup
		promptAlert.sendKeys("yes");
		Thread.sleep(1000);
		
		// To click on 'OK' button
		// promptAlert.accept();

		// To click on 'CANCEL' button
		promptAlert.dismiss();
	}

}
