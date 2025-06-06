package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	  WebDriver	driver=new ChromeDriver();
	  Thread.sleep(3000);
	  driver.close();

	}

}
