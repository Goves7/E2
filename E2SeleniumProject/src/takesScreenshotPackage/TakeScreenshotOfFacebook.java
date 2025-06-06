package takesScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotOfFacebook {

	public static void main(String[] args) throws IOException {
		String dateTime = LocalDateTime.now().toString();
		String timeStamp = dateTime.replaceAll(":", "-");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Step 1 : Type casting driver ref in TakesScreenshot type
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Step 2: Capturing the screenshot using getScreenshotAs() 
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3: Creating a new File to specify the path,name and extension to store the screenshot
		File dest = new File("./screenshots/facebook"+timeStamp+".png");
		
		//Step 4 : Copying and storing the screenshot by using copy() of FileHandler class
		FileHandler.copy(src, dest);
	}

}
