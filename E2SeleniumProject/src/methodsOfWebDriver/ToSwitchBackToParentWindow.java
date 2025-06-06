package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToParentWindow {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.swiggy.com/");
	   Thread.sleep(1000);
	   //Capturing window Id Of Main Window
	   String parentWindowHandle = driver.getWindowHandle();
	   Thread.sleep(1000);
	   
	   // Opening a new Tab
	   driver.switchTo().newWindow(WindowType.TAB);
	   driver.get("https://www.phonepe.com/");
	   Thread.sleep(2000);
	   
	   //Opening a new Window 
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   driver.get("https://omayo.blogspot.com/");
	   Thread.sleep(2000);
	   
	   // Switching to Main Window by using Window Id of Main Window
	   driver.switchTo().window(parentWindowHandle);
	   Thread.sleep(1000);
	   
	   // Closing the Main Window where control is switched/Present
	   driver.close();
	}

}
