package actionsClassPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenLoginPageInANewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		// Storing the title of expected WebPage
		String expectedTitle="Demo Web Shop. Login";
		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		
		// Fetching the address/handle of parent tab
		String parentWindowHandle = driver.getWindowHandle(); 
		
		// Creating the object of Actions Class
		Actions act = new Actions(driver);
		
		act.keyDown(loginLink, Keys.SHIFT).click().perform();
		Thread.sleep(500);
		
		act.keyUp(loginLink, Keys.SHIFT).perform();
	//	act.keyUp(Keys.SHIFT).perform();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		allWindows.remove(parentWindowHandle);
		
		for(String wi : allWindows)
		{
			driver.switchTo().window(wi);
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(expectedTitle))
			{
				break;
			}
		}
		
		driver.findElement(By.id("Email")).sendKeys("qspwakad@gmail.com");

	}

}
