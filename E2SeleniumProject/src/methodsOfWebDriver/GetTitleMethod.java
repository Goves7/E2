package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); // To Launch The Browser 
		
		driver.get("https://www.zomato.com/"); // To Launch The Web Application
		
		String title = driver.getTitle(); // To Fetch The Title Of The Web Page
		
		System.out.println(title); // To Print The Title

	}

}
