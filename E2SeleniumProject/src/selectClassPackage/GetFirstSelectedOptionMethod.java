package selectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(1000);
		
		// To find the Multiselect Dropdown
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		
		// Creating the Object of Select Class to handle the Dropdown
		Select sel = new Select(dropdown);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(500); 
		
		sel.selectByIndex(2);
		Thread.sleep(500);
		
		sel.selectByValue("swiftx");
		Thread.sleep(500);
		
		
		// To fetch the first selected Option from among all the selected Options
		WebElement firstSelectedOpt = sel.getFirstSelectedOption();
		String text = firstSelectedOpt.getText();
		System.out.println(text);
		

	}

}
