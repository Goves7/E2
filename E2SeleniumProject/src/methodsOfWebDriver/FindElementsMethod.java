package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.google.co.in/");
		   
		   WebElement activeEle = driver.switchTo().activeElement();
		   Thread.sleep(1000);
		   activeEle.sendKeys("bikes");   
		   Thread.sleep(1000);
		   
		   List<WebElement> bikesOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		   
		   for(WebElement we : bikesOptions)
		   {
			   String text = we.getText(); 
			   System.out.println(text);
			   Thread.sleep(1000);     
		   }

	}

}
