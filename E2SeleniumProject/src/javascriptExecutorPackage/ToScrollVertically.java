package javascriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollVertically {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		// To typecast WebDriver Ref into JavascriptExecutor Interface
        JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		// To perform Vertical Scrolling Operation
        jse.executeScript("window.scrollBy(0,500)");
	}

}
