package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFunction {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver	driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demowebshop.tricentis.com/");
		  
		//  driver.findElement(By.xpath("//a[text()='Log in']")).click();
		  
		  driver.findElement(By.xpath("//li[.='Log in']")).click();
		  Thread.sleep(1000);
		  
		  WebElement emailText = driver.findElement(By.xpath("//label[text()='Email:']"));
		  
		  String text = emailText.getText();
		  
		  System.out.println(text);

	}

}
