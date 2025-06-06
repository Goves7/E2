package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsEndsAnyCssLocator {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.cssSelector("input[name^='Em']")).sendKeys("collinqspwakad@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("9876543210");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[value*='g i']")).click();
		
	}

}
