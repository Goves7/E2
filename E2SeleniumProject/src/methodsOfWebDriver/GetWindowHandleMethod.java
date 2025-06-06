package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); //To Launch The Browser
		
		driver.get("https://www.goindigo.in/"); // To Launch The Web Application
		
		String parentWindowHandle = driver.getWindowHandle();// To Get The Address/Session Id/Handle of parent Window
		
		System.out.println(parentWindowHandle); // To Print The Address/Session Id/ Handle

	}

}
