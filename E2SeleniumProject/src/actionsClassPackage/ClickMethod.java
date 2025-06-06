package actionsClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// Finding the WebElement and storing in a variable
		WebElement uploadFileButton = driver.findElement(By.id("uploadfile"));
	
		// Trying to click on the WebElement by using click() of WebElement Interface
		//	uploadFileButton.click(); ---> Not Working 
		
		// Creating the Object of Actions Class
		Actions act = new Actions(driver);
	
		//To perform click Operation using click() of Actions class
	   //act.moveToElement(uploadFileButton).click().perform();
		
		// To perform click Operation using click(WebElement target) of Actions class
		act.click(uploadFileButton).perform();

	}

}
