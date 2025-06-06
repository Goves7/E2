package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		
		WebElement emailTB = driver.findElement(By.id("Email"));
        Thread.sleep(1000);
        
        emailTB.sendKeys("qwerty", Keys.ENTER);
        Thread.sleep(1000);
        
        WebElement errorMessage = driver.findElement(By.xpath("//span[text()='Please enter a valid email address.']"));

        String color = errorMessage.getCssValue("color");
        System.out.println(color);
	}

}
