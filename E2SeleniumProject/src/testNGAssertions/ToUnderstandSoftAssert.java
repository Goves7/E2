package testNGAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToUnderstandSoftAssert {
  @Test
  public void verifyUsingSoftAssert() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  String expectedTitleOfElectronicsPage= "Demo Web Shop. Electronics ";
	  
	  driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(), expectedTitleOfElectronicsPage,"Electronics Page Is Not Displayed");
	  
	  driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
	  
	  String expectedTitleOfCellPhonesPage ="Demo Web Shop. Cell phones ";
	  
	  sa.assertEquals(driver.getTitle(), expectedTitleOfCellPhonesPage, "Cell Phones Page Is Not Displayed");
  
      sa.assertAll();
  }
}
