package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInGoogle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Gmail")).click();
       // driver.switchTo().defaultContent();
	}

}
