package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignmentVerification {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		WebElement passwordTB = driver.findElement(By.id("Password"));
		
		Dimension emailTBSize = emailTB.getSize();
		Point emailTBLocation = emailTB.getLocation();
		
		Dimension PasswordTBSize = passwordTB.getSize();
		Point passwordTBLocation = passwordTB.getLocation();
		
		int leftAlignment = (emailTBLocation.getX())-(passwordTBLocation.getX());

		if(leftAlignment > -5 && leftAlignment < 5)
		{
			System.out.println(" Left Alignment is Correct");
		}
		else
		{
			System.out.println(" Left Alignment is Not Correct");
		}
		
		int rightAlignment = (emailTBLocation.getX()+emailTBSize.getWidth())-(passwordTBLocation.getX()+PasswordTBSize.getWidth());
	    
		if(rightAlignment > -5 && rightAlignment < 5)
		{
			System.out.println("Right Alignment is Correct");
		}
		else
		{
			System.out.println("Right Alignment is Not Correct");
		}
		
		int overlapVerification = (passwordTBLocation.getY())-(emailTBLocation.getY()+emailTBSize.getHeight());
		if(overlapVerification > 0)
		{
			System.out.println("Elements are not Overlapping");
		}
		else
		{
			System.out.println("Elements are Overlapping");
		}
	}

}
