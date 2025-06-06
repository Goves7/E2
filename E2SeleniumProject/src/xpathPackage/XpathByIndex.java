package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Collin/Desktop/WebElements/TextBoxes.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("qspwakad@123");
		

	}

}
