package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveElement {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.co.in/");
	   Thread.sleep(1000);
	   
	   // Switching  to activeElement and passing data in searchbox of Google
	   driver.switchTo().activeElement().sendKeys("KGF Chapter 2",Keys.ENTER);
	}

}
