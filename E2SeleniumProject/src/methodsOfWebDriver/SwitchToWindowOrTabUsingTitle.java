package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindowOrTabUsingTitle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cadbury.co.uk/");
		Thread.sleep(1000);
		
		// Opening a new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nestle.in/");
		String expectedTitle= "Nestlé: Good Food, Good Life | Nestlé IN";
		Thread.sleep(1000);
		
		// Opening a new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.morde.com/");
		Thread.sleep(1000);
		
		// Getting the addresses or Ids of all the Windows/Tabs
		Set<String> allWindowIds = driver.getWindowHandles();
		
		// Fetching Window Ids one By one  
		for(String wi : allWindowIds)
		{
			//Switching the control To Window id
			driver.switchTo().window(wi);
			Thread.sleep(1000);
			// Fetching the actual Title of the page using getTitle()
			String actualTitle = driver.getTitle();
			
			//Comparing the actual and expexted title
			if(actualTitle.equals(expectedTitle))
			{
				break; // breaking the loop
			}
		}
		driver.close();// closing the desired Tab/Window

	}

}
