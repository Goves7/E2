package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    
	    driver.findElement(By.name("q")).sendKeys("Laptop", Keys.ENTER);
	    
	    driver.findElement(By.xpath("//div[text()='Brand']")).click();
	    Thread.sleep(500);
	    
	    driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling :: div")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//div[text()='Core i7']/preceding-sibling :: div")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("(//div[text()='RAM Capacity'])[1]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//div[text()='16 GB']/preceding-sibling :: div")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//div[text()='Windows 11']/preceding-sibling :: div")).click();
	    Thread.sleep(1000);
	    
	    List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	    Thread.sleep(500);
	    
	    for( WebElement we:laptops)
	    {
	    	System.out.println(we.getText());
	    	Thread.sleep(1000);
	    }
	
	}

}
