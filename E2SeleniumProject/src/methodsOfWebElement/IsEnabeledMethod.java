package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabeledMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
		Thread.sleep(2000);
		
		WebElement submitButton = driver.findElement(By.id("submitButton"));
		Thread.sleep(1000);
		
		
		if(submitButton.isEnabled())
		{
			submitButton.click();
		}
		else
		{
			System.out.println("Submit Button Is Disabled");
		}
		

	}

}
