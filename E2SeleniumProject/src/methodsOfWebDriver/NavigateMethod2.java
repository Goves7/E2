package methodsOfWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod2 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		WebDriver driver = new ChromeDriver();// To Launch The Browser

		driver.get("https://www.goindigo.in/"); // To Launch goingigo Web Application
		Thread.sleep(2000);

		driver.get("https://www.facebook.com/"); // To Launch facebook Web Application
		Thread.sleep(2000);

		Navigation nav = driver.navigate();
       
//		URL url = new URL("https://www.dream11.com/"); Create the Object of URL class and pass URL of application 
//		nav.to(url);   Pass ref of URL Class as an Argument
		
		nav.to(new URL("https://www.dream11.com/")); // Create the Object of Url Class inside  to() and pass url
		Thread.sleep(2000);

		nav.back(); // To Perform Backward Navigational Operation
		Thread.sleep(2000);

		nav.forward(); // To Perform Forward Navigational Operation
		Thread.sleep(2000);

		nav.refresh(); // To Perform Refresh Operation

	}

}
