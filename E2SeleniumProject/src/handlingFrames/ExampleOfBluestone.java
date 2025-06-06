package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOfBluestone {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bluestone.com/");
		
		// To handle the Popup
        driver.findElement(By.id("denyBtn")).click();
        
        // To switch the control to the Frame
        driver.switchTo().frame("fc_widget");
        
        // To click on Chat Icon 
        driver.findElement(By.id("chat-icon")).click();
        
        // To switch the control back to main page
        driver.switchTo().defaultContent();
        
        // To pass inputs to the 'Name Textbox' 
        driver.findElement(By.id("chat-fc-name")).sendKeys("Collin");
       
	}

}
