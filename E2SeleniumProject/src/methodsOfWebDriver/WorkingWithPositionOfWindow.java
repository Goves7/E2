package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPositionOfWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();// To Launch Browser and Upcast
		
		// To get Position (x and y axis) of the window
		Point point = driver.manage().window().getPosition(); 
		
		int xaxis = point.getX();// to get the value of x axis
		int yaxis = point.getY();// to get the value of y axis
		
		// To print the value of x and y axis
		System.out.println("X-Axis is :"+xaxis+"  Y-Axis is :"+yaxis);
		Thread.sleep(2000);
		
		// Creating object of Point and passing x and y values in pixels
		Point targetPoint = new Point(250,180);
		
		// To set the position of browser window
		driver.manage().window().setPosition(targetPoint);
		

	}

}
