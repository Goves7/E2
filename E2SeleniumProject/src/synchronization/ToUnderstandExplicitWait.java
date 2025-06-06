package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Declaring Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		// Declaring Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.get("https://www.shoppersstack.com/products_page/82");
      
        driver.findElement(By.id("Check Delivery")).sendKeys("411033");
        
        WebElement checkButton = driver.findElement(By.id("Check"));
        
        // Stopping the execution based on condition using Explicit Wait
        wait.until(ExpectedConditions.elementToBeClickable(checkButton));
        
        // Performing click operation after condition has come true
        checkButton.click();
	}

}
