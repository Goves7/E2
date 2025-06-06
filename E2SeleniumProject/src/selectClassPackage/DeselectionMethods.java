package selectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		WebElement multiselectDD = driver.findElement(By.id("multiselect1"));
		
		//Creating the object of Select class to Handle Multiselect Dropdown
		Select sel = new Select(multiselectDD);
		
        //Selection Methods
		sel.selectByIndex(0);//Selecting an Option by index --->Volvo
		Thread.sleep(1000);
		
		sel.selectByValue("audix"); //Selecting an Option by value --->Audi
		Thread.sleep(1000);
		
		sel.selectByVisibleText("Swift");//Selecting an Option by Visible Text --->Swift
		Thread.sleep(1000);
		
		// Deselection Methods
		sel.deselectByValue("swiftx");//Deselecting an option by Value ---> Swift
		Thread.sleep(1000);
		
		sel.deselectByIndex(3);//Deselecting an option by Index ---> Audi
		Thread.sleep(1000);
		
		sel.deselectByVisibleText("Volvo");//Deselecting an option by Visible Text ---> Volvo
	}

}
