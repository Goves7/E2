package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod1 {

	public static void main(String[] args) throws InterruptedException {
		
	  WebDriver	driver=new ChromeDriver();
	  
	  // Steps to perform maximize Operation on browser window 
//	  Options ops = driver.manage();
//	  Window wi = ops.window();
//	  wi.maximize();
	  
	  driver.manage().window().maximize(); // To maximize the browser Window
	  
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(3000);
	  
	  driver.manage().window().minimize(); // To minimize the browser window
	  Thread.sleep(2000);
	    
	  driver.manage().window().fullscreen(); // To Open browser in full screen mode
	  
	}

}
