package selectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		Thread.sleep(1000);
		
		WebElement dayDD = driver.findElement(By.id("day"));
		WebElement monthDD = driver.findElement(By.id("month"));
		WebElement yearDD = driver.findElement(By.id("year"));
		Thread.sleep(1000);
		
		//Select Class Object To Handle Day Dropdown
		Select day = new Select(dayDD);
		day.selectByIndex(24); //Selecting the option based on Index for -->25th
		Thread.sleep(1000);
		
		//Select Class Object To Handle Month Dropdown
		Select month = new Select(monthDD);
		month.selectByValue("6"); //Selecting the option based on Value for -->Jun
		Thread.sleep(1000);
		
		//Select Class Object To Handle Year Dropdown
		Select year = new Select(yearDD);
		year.selectByVisibleText("1996");//Selecting the option based on Visible Text for -->1996

	}

}
