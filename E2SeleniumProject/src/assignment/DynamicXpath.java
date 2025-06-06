package assignment;

import java.time.LocalDateTime;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
        
		LocalDateTime todaysDate = LocalDateTime.now();
		System.out.println(todaysDate);
		Month month = todaysDate.getMonth();
	    System.out.println(month);	
        String monthInString = month.toString();
	    System.out.println(monthInString);
	    
	    String newMonth = monthInString.charAt(0)+monthInString.substring(1).toLowerCase();
	    System.out.println(newMonth);
	    
	    int day = todaysDate.getDayOfMonth();
	    System.out.println(day);
	  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("date-box")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//div[text()='May']/../..//span[text()='12']")).click();
        driver.findElement(By.xpath("//div[text()='"+newMonth+"']/../..//span[text()='"+day+"']")).click();
	}

}
