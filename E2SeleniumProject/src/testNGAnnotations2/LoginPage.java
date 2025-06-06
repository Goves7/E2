package testNGAnnotations2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Declaration
	@FindBy(id = "Email") private WebElement emailTB;
	@FindBy(id = "Password") private WebElement pwdTB;
	@FindBy(id = "RememberMe") private WebElement rememberMeCheckbox;
	@FindBy(linkText = "Forgot password?") private WebElement forgotPasswordLink;
	@FindBy(xpath = "//input[@value='Log in']") private WebElement loginButton;


	// Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	// Utilization
	public WebElement getEmailTB() {
		return emailTB;
	}


	public WebElement getPwdTB() {
		return pwdTB;
	}


	public WebElement getRememberMeCheckbox() {
		return rememberMeCheckbox;
	}


	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}
	
	// Operational Methods/ Business Logic
	
	public void validLoginMethod(String email, String password) throws InterruptedException
	{
		emailTB.sendKeys(email);
		Thread.sleep(500);
		pwdTB.sendKeys(password);
		Thread.sleep(500);
		loginButton.click();
	}
	
	public void invalidLoginMethod(String email, String password) throws InterruptedException
	{
		emailTB.sendKeys(email);
		Thread.sleep(500);
		pwdTB.sendKeys(password);
		Thread.sleep(500);
		loginButton.click();
		
		Thread.sleep(500);
		emailTB.clear();
		pwdTB.clear();
		Thread.sleep(1000);
		
	}
	
}
