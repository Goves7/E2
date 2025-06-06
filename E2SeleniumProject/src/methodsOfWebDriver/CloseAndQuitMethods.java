package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitMethods {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.titan.co.in/");
		 Thread.sleep(1000);
		 
		 // Opening a new Tab and Launching Fossil
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.fossil.com/en-in/");
		 Thread.sleep(2000);
		 String expectedUrl="https://www.fossil.com/en-in/";
		 
		 // Opening a new Window and Launching Fastrack
		 driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.fastrack.in/");
        Thread.sleep(2000);
        
        // Capturing the Handles/Ids/Addresses of all the Tabs/Windows
         Set<String> allWindowIds = driver.getWindowHandles();
         
         // Iterating to Ids using for each loop
         for(String wi : allWindowIds )
         {
       	  //Switching the control to particular window/tab
       	  driver.switchTo().window(wi);
       	  
       	  //Fetching the actual url
       	  String actualUrl = driver.getCurrentUrl();
       	  
       	  //comparing actualUrl with ExpectedUrl
       	  if(actualUrl.equals(expectedUrl))
       	  {
       		  break;
       	  }
         }
        
         // Closing the Window/Tab where driver Control is present
         driver.close();
         Thread.sleep(2000);
         
         // Closing all the Windows/Tabs as well as destroying the driver file.
         driver.quit();
         

	}

}
