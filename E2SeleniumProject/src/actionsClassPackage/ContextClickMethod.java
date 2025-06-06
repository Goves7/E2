package actionsClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Right Click")).click();
		Thread.sleep(2000);
		
		WebElement button1 = driver.findElement(By.id("btn30"));
		
		WebElement button2 = driver.findElement(By.id("btn31"));
		
		WebElement button3 = driver.findElement(By.id("btn32"));
		
		// Creating the Object of Actions Class
		Actions act = new Actions(driver);
		
		act.moveToElement(button1).contextClick().perform(); // Performing right click operation on Button1
		driver.findElement(By.xpath("//div[text()='Yes']")).click(); //Selecting Yes Option
		Thread.sleep(500);
		// Capturing the Message after selecting Yes Option
		WebElement message1 = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		System.out.println(message1.getText()); // Printing the Captured Message
		Thread.sleep(500);
		
		act.contextClick(button2).perform(); // Performing right click operation on Button2
		driver.findElement(By.xpath("//div[text()='No']")).click(); //Selecting No Option
		Thread.sleep(500);
		// Capturing the Message after selecting No Option
		WebElement message2 = driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
		System.out.println(message2.getText());  // Printing the Captured Message
		
		
		act.contextClick(button3).perform(); // Performing right click operation on Button2
		driver.findElement(By.xpath("//div[text()='5']")).click(); //Selecting Rating as 5 
		Thread.sleep(500);
		// Capturing the Message after selecting Rating as 5
		WebElement message3 = driver.findElement(By.xpath("//span[text()='You selected \"5\"']"));
		System.out.println(message3.getText()); // Printing the Captured Message
		

	}

}
