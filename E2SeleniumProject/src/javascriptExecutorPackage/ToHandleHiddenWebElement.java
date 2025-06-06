package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenWebElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.facebook.com/r.php?entry_point=login");
	    
	    // Finding the Hidden WebElement and Storing it.
	    WebElement hiddenTB = driver.findElement(By.id("custom_gender"));
	    
	    // Typecasting the ref of WebDriver Interface into JavascriptExecutor Interface
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    
	    // Passing inputs in the Hidden WebElement
	    jse.executeScript("arguments[0].value='Is It Working ??'", hiddenTB);
	}

}
