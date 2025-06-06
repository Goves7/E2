package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingScreenshotOfAWebElement {

	public static void main(String[] args) throws IOException {
		
		String dateTime = LocalDateTime.now().toString();
		String timeStamp = dateTime.replaceAll(":", "-");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Step 1: Locating the WebElement and storing 
		WebElement loginButton = driver.findElement(By.name("login"));

		//Step 2: Capturing the screenshot of WE by accessing getScreenshotAs() through ref var of WE
		File src = loginButton.getScreenshotAs(OutputType.FILE);
		
		//Step 3: Creating new File and specifying Path,name and extension to store the screenshot
		File dest = new File("./screenshots/FbLoginButton"+timeStamp+".png");
		
		// Step 4: Storing the screenshot by using copy() of Files class from com.google.common.io package
		Files.copy(src, dest);
	}

}
