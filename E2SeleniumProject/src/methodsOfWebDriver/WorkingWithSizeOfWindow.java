package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSizeOfWindow {

	public static void main(String[] args) throws InterruptedException {
		
	   WebDriver driver=new ChromeDriver(); // To launch the browser and upcast
	   driver.manage().window().maximize(); // To maximize the browser window
	   Thread.sleep(1000);
	   
	   Dimension size = driver.manage().window().getSize(); // To get the dimensions of browser window
       
	   int height = size.getHeight();// To get the Height of browser window
	   int width = size.getWidth(); // To get the Width of browser window
	   
	   System.out.println("Height is :"+height+"   Width is :"+width); // To print the Height and Width
	   Thread.sleep(1000);
	   
	   Dimension targetSize = new Dimension(500, 300); // Object of Dimension class to specify width and height
	   driver.manage().window().setSize(targetSize); // Pass the specified dimension to setSize()
	}

}
