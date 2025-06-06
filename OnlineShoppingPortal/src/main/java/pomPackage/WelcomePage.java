package pomPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	// Declaration
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(linkText = "Log in") private WebElement loginLink;
	@FindBy(partialLinkText = "Shopping cart") private WebElement shoppingCartLink;
	@FindBy(partialLinkText = "Wishlist") private WebElement wishlistLink;
	@FindBy(partialLinkText = "BOOKS") private WebElement booksLink;
	@FindBy(partialLinkText = "COMPUTERS") private WebElement computersLink;
	@FindBy(partialLinkText = "ELECTRONICS") private WebElement electronicsLink;
	@FindBy(linkText = "Log out") private WebElement logoutLink;
	
	
	

	// Initialization
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	// Utilization
	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}


	public WebElement getWishlistLink() {
		return wishlistLink;
	}


	public WebElement getBooksLink() {
		return booksLink;
	}


	public WebElement getComputersLink() {
		return computersLink;
	}


	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	
	
}
