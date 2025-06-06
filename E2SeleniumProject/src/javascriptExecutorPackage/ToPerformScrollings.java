package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");

		// To typecast WebDriver's Ref into JavascriptExecutor Interface
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		// Scrolling 400 pixels on x-axis(RHS) and 1000 pixels on y-axis(top to bottom) 
		jse.executeScript("window.scrollBy(400,1000)");
		Thread.sleep(1000);
		// Scrolling 150 pixels on x-axis(LHS) and 300 pixels on y-axis(top to bottom)
		jse.executeScript("window.scrollBy(-150,300)");
		Thread.sleep(1000);
		
        // Scrolling 0 pixels on x-axis and 650 pixels on y-axi(Bottom to top)
		jse.executeScript("window.scrollBy(0,-650)");

	}

}
