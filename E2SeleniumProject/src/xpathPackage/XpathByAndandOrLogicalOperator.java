package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAndandOrLogicalOperator {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("file:///C:/Users/Collin/Desktop/WebElements/RadioButtons.html");
	
         driver.findElement(By.xpath("//input[@name='gender' and @value='Female']")).click();
         Thread.sleep(2000);
         
         driver.navigate().refresh();
         
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@name='gender' or @value='Female']")).click();
         
	}

}
