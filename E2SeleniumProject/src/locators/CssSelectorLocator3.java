package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator3 {

	public static void main(String[] args) {
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/");
	   
	   driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	   
	   driver.findElement(By.cssSelector("img[title='Show products in category Cell phones']")).click();
	   
	   driver.findElement(By.cssSelector("img[title='Show details for Smartphone']")).click();

	}

}
