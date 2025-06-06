package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrollTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");

		// To typecast WebDriver's Ref into JavascriptExecutor Interface
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		// Scrolling 0 pixels on x-axis and 1000 pixels on y-axis(top to bottom) 
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(1000);
		
		// Scrolling 0 pixels on x-axis and 500 pixels on y-axis(top to bottom)
		// scrollTo() will count the pixels from 0 again.
		jse.executeScript("window.scrollTo(0,500)");

	}

}
