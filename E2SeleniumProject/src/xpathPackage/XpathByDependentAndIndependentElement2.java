package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependentAndIndependentElement2 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//img[contains(@alt,'Cell phones')]")).click();
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("//img[@alt='Picture of Smartphone']/../../..//input[@value='Add to cart']")).click();
         Thread.sleep(1000);
         
         driver.findElement(By.linkText("Shopping cart")).click();
         Thread.sleep(3000);
         
         driver.quit();
	}

}
