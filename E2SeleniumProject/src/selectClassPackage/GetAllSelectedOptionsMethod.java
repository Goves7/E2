package selectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		// To find the Multiselect Dropdown
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		
		// Creating the Object of Select Class to handle the Dropdown
		Select sel = new Select(dropdown);
		
		sel.selectByVisibleText("Audi");// To select using Visible Text ---> Audi
		Thread.sleep(500); 
		
		sel.selectByIndex(2); // To select using index ---> Hyundai
		Thread.sleep(500);
		
		sel.selectByValue("swiftx"); //To select by Value ---> Swift
		Thread.sleep(500);
		
		// To Fetch all the selected Options from the dropdown
		List<WebElement> allSelectedOps = sel.getAllSelectedOptions();
		
		// To get the text of each option that was selected
		for( WebElement we: allSelectedOps)
		{
		   String text = we.getText();
		   System.out.println(text);
		   Thread.sleep(500);
		}

	}

}
