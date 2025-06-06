package testNGAnnotations2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		emailTB.sendKeys("qspwakad@gmail.com");
		Thread.sleep(1000);
		
		WebElement pwdTB = driver.findElement(By.id("Password"));
		pwdTB.sendKeys("Wakad@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
