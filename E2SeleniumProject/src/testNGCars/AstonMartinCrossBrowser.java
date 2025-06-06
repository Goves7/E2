package testNGCars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AstonMartinCrossBrowser {
 
  @Parameters({"bname","url"})
  @Test
  public void astonMartinTC(String bname, String url) throws InterruptedException 
  { 
	  WebDriver driver=null;
	  
	  if(bname.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(bname.equalsIgnoreCase("firefox"))
	  {
		driver=new FirefoxDriver();  
	  }
	  else if(bname.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  else
	  {
		  Reporter.log("Enter a valid browser value", true);
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(url);
	  Thread.sleep(2000);
	  driver.quit();
  }
}
