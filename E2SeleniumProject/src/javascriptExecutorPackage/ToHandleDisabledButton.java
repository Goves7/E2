package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://omayo.blogspot.com/");
	    
	    //Finding the Disabled Element and storing it.
	    WebElement disabledButton = driver.findElement(By.id("but1"));
	   // disabledButton.click();
	    Thread.sleep(1000);
	    
	   // Typecasting WebDriver's Ref into JavascriptExecutor Interface
          JavascriptExecutor jse = (JavascriptExecutor)driver;
      
          jse.executeScript("arguments[0].click()", disabledButton);
	}

}
