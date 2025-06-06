package testNGAnnotations2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage  {
    // Declaration
	@FindBy(xpath = "//input[@name='removefromcart']/../..//img[@alt='Picture of Smartphone']")private WebElement smartPhoneCartItem;
    @FindBy(xpath = "//a[text()='Smartphone' and @class='product-name']/../..//input[@name='removefromcart']") private WebElement checkboxForSmartphone;
	@FindBy(name = "updatecart") private WebElement updateShoppingCartButton;
    @FindBy(id = "termsofservice")private WebElement termsOfServiceCheckbox;
	@FindBy(id="checkout") private WebElement checkoutButton;

	
	// Initialization
	public ShoppingCartPage(WebDriver driver)
	{
	   PageFactory.initElements(driver,this);	
	}

	// Utilization
	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}
	public WebElement getCheckboxForSmartphone() {
		return checkboxForSmartphone;
	}

	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}
	public WebElement getTermsOfServiceCheckbox() {
		return termsOfServiceCheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	
}
