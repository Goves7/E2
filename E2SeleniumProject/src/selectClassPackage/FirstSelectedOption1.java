package selectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Collin/Desktop/WebElements/Dropdowns.html");
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.name("Companies2"));
		
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(3);
		Thread.sleep(500);
		
		sel.selectByValue("v12");
		Thread.sleep(500); 
		
		sel.selectByVisibleText("Amazon");
		Thread.sleep(500);
		
		WebElement firstOpt = sel.getFirstSelectedOption();
		System.out.println(firstOpt.getText());
		
		

	}

}
