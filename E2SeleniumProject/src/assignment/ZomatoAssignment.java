package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ZomatoAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/");
        Thread.sleep(2000);
        
         String expectedTitle ="Zomato | Facebook";
		
		WebElement linkedLink = driver.findElement(By.xpath("(//a[@href='https://in.linkedin.com/company/zomato'])[2]"));
		Thread.sleep(500);

		WebElement instaLink = driver.findElement(By.xpath("(//a[@href='https://www.instagram.com/zomato/'])[2]"));
		Thread.sleep(500);

		WebElement youtubeLink = driver.findElement(By.xpath("(//a[@href='https://www.youtube.com/zomato'])[2]"));
		Thread.sleep(500);

		WebElement facebookLink = driver.findElement(By.xpath("(//a[@href='https://www.facebook.com/zomato'])[2]"));
		Thread.sleep(500);
		
		WebElement twitterLink = driver.findElement(By.xpath("(//a[@href='https://twitter.com/zomato'])[2]"));
		
		
		Actions act = new Actions(driver);
		act.click(linkedLink).perform();
		Thread.sleep(500);
		
		act.click(instaLink).perform();
		Thread.sleep(500);
		
		act.click(facebookLink).perform();
		Thread.sleep(500);
		
		act.click(youtubeLink).perform();
		Thread.sleep(500);
		
		act.click(twitterLink).perform();
		Thread.sleep(500);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String wi : allWindowIds)
		{
			driver.switchTo().window(wi);
			String actualTitle = driver.getTitle();
			
			if(actualTitle.equals(expectedTitle))
			{
				break;
			}
		}
		
		Thread.sleep(2000);
		//driver.findElement(By.name("email")).sendKeys("Collin Goves");
		driver.findElement(By.xpath("(//span[text()='Log in'])[3]")).click();
	}

}
