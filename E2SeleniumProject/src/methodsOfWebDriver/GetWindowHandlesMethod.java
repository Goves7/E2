package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cadbury.co.uk/");
		Thread.sleep(1000);
		
		// Opening a new Tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nestle.in/");
		Thread.sleep(1000);
		
		// Opening a new Window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.morde.com/");
		Thread.sleep(1000);
		
		// Getting the addresses or Ids of all the Windows/Tabs
		Set<String> allWindowIds = driver.getWindowHandles();
		
		// Fetching the addresses or Ids of all the Windows/Tabs one by one
		for(String wi: allWindowIds)
		{
			System.out.println(wi);// To Print the addresses/Ids of all the Windows/Tabs
			Thread.sleep(1000);
		}

	}

}
