package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDisableNotificationPopup {

	public static void main(String[] args) {
		//Creating the Object of ChromeOptions classss
		ChromeOptions co = new ChromeOptions();
		// To disable the Notification Popup
		co.addArguments("--disable-notifications");
		
		// Creating the Object of ChromeDriver and passing the reference of ChromeOptions to Disable the Notification Popup
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		// Declaring Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Declaring Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        
		// Launching the Web Application
		driver.get("https://www.easemytrip.com/");


	}

}
