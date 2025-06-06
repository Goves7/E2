package testNGHelperAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOutHelperAttribute {
  
  @Test(timeOut = 7000)
  public void zomato() 
  {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://www.zomato.com/");
	 driver.quit();
  }
}
