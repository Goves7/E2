package testNGAnnotations2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellphonesPage {
	
	    // Declaration
		@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']") private WebElement smartPhoneAddToCartButton;

		// Initialization
		public CellphonesPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		// Utilization
		public WebElement getSmartPhoneAddToCartButton() {
			return smartPhoneAddToCartButton;
		}
		
		
		

}
