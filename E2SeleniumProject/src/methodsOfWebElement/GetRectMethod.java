package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement passwordTB = driver.findElement(By.id("pass"));
		
		Rectangle rect = passwordTB.getRect();
        int width = rect.getWidth();
        int height = rect.getHeight();
        int xaxis = rect.getX();
        int yaxis = rect.getY();
        
        System.out.println("Width is :"+width+" Heigth is :"+height+" X-Axis is :"+xaxis+" Y-Axis is :"+yaxis);
		
	}

}
