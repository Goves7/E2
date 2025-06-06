package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("collinqspwakad@gmail.com");
        Thread.sleep(1000);
        
		driver.findElement(By.name("pass")).sendKeys("9876543210");
		Thread.sleep(1000);
		
		driver.findElement(By.name("login")).click();
	}

}
