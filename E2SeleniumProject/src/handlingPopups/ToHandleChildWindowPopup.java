package handlingPopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Declaring Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Declaring Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        
		// Launching the Web Application
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(500);
		
		// To get the Address/Id of Parent/Main Window
		String parentWindowId = driver.getWindowHandle();
		
		// To open a new/child Window
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(500);
	
		// To get the Addresses/Ids of all windows
		Set<String> allWindowIds = driver.getWindowHandles();
		
		// Manually storing the Title of the expected window i.e(child window)
		String expectedTitle="New Window";
		
		// Iterating the Ids of all the Windows that are Open
		for(String wi : allWindowIds)
		{
			//Switching the driver control to each window
			driver.switchTo().window(wi);
			//Fetching the Title of each Window
			String actualTitle = driver.getTitle();
			
			//Comparing the Actual Title with Expected Title 
			if(actualTitle.equals(expectedTitle))
			{   // To break the loop if the Title is Matched
				break;
			}
		}
		
		//To get the text of the element present on the child window
		String text = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		// To Print the text.
		System.out.println(text);
        
	}

}
