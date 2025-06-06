package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16",Keys.ENTER);
	  Thread.sleep(1000);
	  
	  WebElement iphonePriceText = driver.findElement(By.xpath
			  ("//span[contains(text(),'Natural Titanium') and contains(text(),'iPhone 16 Pro 128 GB')]/../../../..//span[text()='1,12,900']"));
	  
	 System.out.println(iphonePriceText.getText()); 
	  

	}

}
