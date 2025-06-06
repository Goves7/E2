package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();// To Launch The Browser
		
		driver.get("https://www.goindigo.in/");
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		Navigation nav = driver.navigate();
		
		nav.to("https://www.dream11.com/"); // To Launch Web Application Using to() of Navigation Interface
		
		Thread.sleep(2000); 
		
		nav.back(); // To Perform Backward Navigational Operation
		Thread.sleep(2000);
		
		nav.forward(); // To Perform Forward Navigational Operation
		Thread.sleep(2000);
		
		nav.refresh(); // To Perform Refresh Operation

	}

}
