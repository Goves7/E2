package selectClassPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseOperationalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Collin/Desktop/WebElements/Dropdowns.html");
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.name("Companies2"));
		
		Select sel = new Select(dropdown);
		
		//To select Options from MultiSelect Dropdown
		sel.selectByIndex(4);
		Thread.sleep(500);
		
		sel.selectByVisibleText("Neilsoft");
		Thread.sleep(500);
		
		sel.selectByValue("v18");
		Thread.sleep(500);
		
		 boolean result = sel.isMultiple();
		 if(result==true)
		 {
			 System.out.println("This dropdown is Multiselect dropdown ");
		 }
		 else
		 {
			 System.out.println("This dropdown is a Singleselect dropdown");
		 }
		 
		 WebElement firstSelOpt = sel.getFirstSelectedOption();
         String firstOptText = firstSelOpt.getText();
         System.out.println("First Selected Option Is :"+firstOptText);
         
         System.out.println("---------- All Selected Options Are------------");
        List<WebElement> allSelOps = sel.getAllSelectedOptions();
        for(WebElement we: allSelOps)
        {
        	System.out.println(we.getText());
        }
        
        // Logic to fetch Options which are not selected
        List<WebElement> allOps = sel.getOptions();
        allOps.removeAll(allSelOps);
        
        System.out.println("----------------Non Selected Options Are-------------");
	    for(WebElement we : allOps)
	    {
	    	System.out.println(we.getText());
	    }
	}

}
