package actionsClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysMethodOfActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		
		WebElement passwordTB = driver.findElement(By.id("Password"));
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		
		// Creating the Object of Actions Class 
		Actions act = new Actions(driver);
	
	// 	Sending input to Email Textfield using sendkeys() of Actions Class
	//	act.moveToElement(emailTB).sendKeys("qspwakad@gmail.com").perform();
        act.sendKeys(emailTB, "qspwakad@gmail.com").perform();
        Thread.sleep(1000);
      
      // Sending input to Password Textfield using sendkeys() of Actions Class  
      //  act.moveToElement(passwordTB).click().sendKeys("qwerty@123").perform();
        act.sendKeys(passwordTB, "qwerty@123").perform();
        Thread.sleep(1000);
       
        // Performing Click Operation on Login Button Using click() of Actions Class
        act.click(loginButton).perform();
	}

}
