package handlingPopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleAuthenticationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Declaring Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Declaring Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Launching the Web Application
		driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
        
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		
		String expectedUrl="https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
		
		Set<String> allWindowIds = driver.getWindowHandles();
        
        for(String wi : allWindowIds)
        {
        	driver.switchTo().window(wi);
        	String actualUrl = driver.getCurrentUrl();
        	
        	if(actualUrl.equals(expectedUrl))
        	{
        		break;
        	}
        }
        
        Robot robot = new Robot();
        
        // To Pass the Username
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);
        Thread.sleep(1000);
        
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_N);
        Thread.sleep(500);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        
        // To Pass the Password
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);
        Thread.sleep(1000);
        
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_N);
        Thread.sleep(500);
        
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
