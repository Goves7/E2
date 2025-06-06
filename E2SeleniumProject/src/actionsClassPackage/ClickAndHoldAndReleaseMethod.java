package actionsClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(500);
		
		//Finding the Element to Click and Hold and then Release 
		WebElement clickandHoldElement = driver.findElement(By.xpath("//div[@id='circle']"));

		// Creating the Object of Actions Class
		Actions act = new Actions(driver);
		
		// To Click and Hold the Element for 3 sescond using Parameterized Method
		act.moveToElement(clickandHoldElement).clickAndHold().perform();
		Thread.sleep(3000);
		
		// To Release the Element which is Held using Parameterized Method
		act.moveToElement(clickandHoldElement).release().perform();
		
		Thread.sleep(1000);
		
		// To Click and Hold the Element for 2 sescond using Non-Parameterized Method
		act.clickAndHold(clickandHoldElement).perform();
		Thread.sleep(2000);
		
		// To Release the Element which is Held using Non-Parameterized Method
		act.release(clickandHoldElement).perform();
		
		
	}

}
