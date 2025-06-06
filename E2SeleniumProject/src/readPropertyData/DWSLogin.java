package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSLogin {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		FileInputStream fis = new FileInputStream("./data/TestData.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String email = prop.getProperty("email");
		
		String pwd = prop.getProperty("password");
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		emailTB.sendKeys(email);
		
		WebElement pwdTB = driver.findElement(By.id("Password"));
		pwdTB.sendKeys(pwd);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();

	}

}
