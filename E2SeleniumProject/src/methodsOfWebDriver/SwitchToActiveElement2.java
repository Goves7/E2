package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement2 {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/login");
	   Thread.sleep(2000);
	  
	   // Switching to activeElement on DWS login page and passing Data in Email Textbox
	   driver.switchTo().activeElement().sendKeys("Collin");
	   

	}

}
