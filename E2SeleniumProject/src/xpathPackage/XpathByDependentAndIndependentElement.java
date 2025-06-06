package xpathPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependentAndIndependentElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.id("date-box")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='May']/../..//span[text()='10']")).click();
	}

}
