package actionsClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// Finding the WebElement and storing in a variable
        WebElement doubleClickTarget = driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));

        // Creating the Object of Actions Class
        Actions act = new Actions(driver);
        
      // To Double Click using Parameterized Method of Actions Class
      //  act.doubleClick(doubleClickTarget).perform();
        
        // To Double Click using No Argument method of Actions Class
        act.moveToElement(doubleClickTarget).doubleClick().perform();
	}

}
