package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		
		WebElement emailTB = driver.findElement(By.id("Email"));
        Thread.sleep(1000);
        
        String emailPrevValue="qspiders@gmail.com";
        
        emailTB.sendKeys(emailPrevValue);
        Thread.sleep(1000);
        
        String attValue = emailTB.getAttribute("value");
        
        if(attValue.equals(emailPrevValue))
        {
        	System.out.println("Email Is Entered Correctly");
        }
        
        else
        {
        	System.out.println("Email Is NOt Entered Correctly");
        }
		
	}

}
