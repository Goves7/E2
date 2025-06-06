package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		WebElement rememberMeCheckbox = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		
		if(rememberMeCheckbox.isSelected())
		{
			System.out.println("Remember Me Checkbox Is Already Selected");
		}
		else
		{
			rememberMeCheckbox.click();
		}
		
	}

}
