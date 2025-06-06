package actionsClassPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenLoginPageinNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		// Storing the title of expected WebPage
		String expectedTitle="Demo Web Shop. Login";
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		
		// Fetching the address/handle of parent tab
		String parentWindowHandle = driver.getWindowHandle(); 
		
		// Creating the object of Actions Class
		Actions act = new Actions(driver);
		
		// To Press CONTROL button and click on loginLink
		act.keyDown(Keys.CONTROL).click(loginLink).perform();
		Thread.sleep(500);
		
		// To Release CONTROL button
		act.keyUp(Keys.CONTROL).perform();
		
		// Fetching the addresses/handles of all the tabs
		Set<String> allWindows = driver.getWindowHandles();
        
		// To remove the address of parent tab
		allWindows.remove(parentWindowHandle);
        
		
        for(String wi : allWindows)
        {    
        	// To switch the control to the new tab
        	driver.switchTo().window(wi);
    	    
        	// To Fetch the title of the current page where control is present
        	String actualTitle = driver.getTitle();
        	
        	// To compare and match the titles
    	    if(actualTitle.equals(expectedTitle))
    	    {
    	    	break; // To break the loop if title is matched
    	    }
        }
        // To find Email Textbox present on new tab and pass inputs
       driver.findElement(By.id("Email")).sendKeys("qspwakad@gmail.com");
	}    
}
