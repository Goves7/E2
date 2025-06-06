package handlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleNotificationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Declaring Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Declaring Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Launching the Web Application
		driver.get("https://www.easemytrip.com/");
        Thread.sleep(3000);
		
        // Creating the object of Robot Class
        Robot robot = new Robot();
		
        // To Press 'TAB' key
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		
		// To Release 'TAB' key
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(500);
		
		// To Press 'ENTER' Key
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		
		// To Release 'ENTER' key
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
