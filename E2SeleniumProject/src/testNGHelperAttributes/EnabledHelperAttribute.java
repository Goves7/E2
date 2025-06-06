package testNGHelperAttributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledHelperAttribute {

	@Test (enabled = true)
	public void launchInstagram() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		Reporter.log("Instagram is Launched !!", true);
		driver.close();
	}

	@Test(enabled = false)
	public void launchFacebook() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Reporter.log("Facebook is Launched !!", true);
		driver.close();
	}
}
