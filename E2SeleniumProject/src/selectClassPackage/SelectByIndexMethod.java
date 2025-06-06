package selectClassPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/Users/Collin/Desktop/WebElements/Dropdowns.html");
       
       // To find the Dropdown and store the address in a variable
       WebElement companiesDD = driver.findElement(By.name("Companies"));
       Thread.sleep(1000);
       
       // Create the Object of Select Class and pass the ref of dropdown
       Select sel = new Select(companiesDD);
       
       // Selecting an option based on index 
       sel.selectByIndex(2); // Amazon is selected
       
       
	}

}
