package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSvgTag {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com/");
		   
		   driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//img[contains(@alt,'Motorola g45 5G')]/../../../../..//*[name()='svg']")).click();
		   
	}

}
