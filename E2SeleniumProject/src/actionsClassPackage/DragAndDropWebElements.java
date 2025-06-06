package actionsClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(1000);
        
        // Finding the source Element
        WebElement osloCapitalSrc = driver.findElement(By.id("box1"));
        // Getting the background-color of src element before dropping
        String beforeDropping = osloCapitalSrc.getCssValue("background-color");
        System.out.println(beforeDropping);
        
        // Finding the target Element
        WebElement norwayOsloTarget = driver.findElement(By.id("box101"));
        
        // Creating the Object of Actions Class
        Actions act = new Actions(driver);
		// To Drag the source element and Drop into Target Element 
        act.dragAndDrop(osloCapitalSrc, norwayOsloTarget).perform();
        Thread.sleep(500);
        
        // Getting the background-color of src element after dropping
        String afterDropping = osloCapitalSrc.getCssValue("background-color");
        System.out.println(afterDropping);
		
	}

}
