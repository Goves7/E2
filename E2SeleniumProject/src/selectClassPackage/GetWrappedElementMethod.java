package selectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(1000);
		
		WebElement dayDD = driver.findElement(By.id("day"));
		
		Select daySel = new Select(dayDD);
		List<WebElement> allOPs = daySel.getOptions();
		
		System.out.println("------ All Options Using getOptions()------");
		for(WebElement we : allOPs)
		{
			System.out.println(we.getText());
		}

		
		System.out.println("----- All Options Using wrappedElement()-----");
		WebElement allOptions = daySel.getWrappedElement();
		System.out.println(allOptions.getText());
		
	}

}
