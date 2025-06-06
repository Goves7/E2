package selectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAndDeselectAllOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		// To find the Multiselect Dropdown
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		
		// Creating the Object of Select Class to handle the Dropdown
		Select sel = new Select(dropdown);
		
		// To Check Whether the Dropdown is Multiselect or No?
		boolean result = sel.isMultiple();
		
		
		if(result==true)
		{
			System.out.println("The Dropdown is Multi Select Dropdown");
		}
		
		else
		{
			System.out.println("The Dropdown is a Single Select Dropdown");
		}
		
		// To fetch all the Options from the Dropdown
		List<WebElement> dropdownOps = sel.getOptions();
		
		int i=0; // Initializing the value of i var to select multiple Ops from dropdown
		for(WebElement we : dropdownOps)
		{
			sel.selectByIndex(i); // Selecting the Ops based on index value
			Thread.sleep(500);
			i++; // Incrementing the value of i by 1 
		}
		
		Thread.sleep(2000);		
		
		// To deselect all the options from the Dropdown at once
		sel.deselectAll();
		

	}

}
