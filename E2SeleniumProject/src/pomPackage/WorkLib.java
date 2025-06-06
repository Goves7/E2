package pomPackage;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WorkLib {

	// To select an option from the dropdown by using Visible Text
	public void selectByVisibleText(WebElement dropdown, String text)
	{
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(text);
	}
	
	// To select an option from the dropdown by using Index
	public void selectByIndex(WebElement dropdown, int index)
	{
		Select sel = new Select(dropdown);
		sel.selectByIndex(index);
	}
	
	// To select an option from the dropdown by using Value
	public void selectByValue(WebElement dropdown, String value)
	{
		Select sel = new Select(dropdown);
		sel.selectByValue(value);
	}
	
	// To generate Random Number
	public int randomNumber()
	{
		Random random = new Random();
		int rn = random.nextInt(1000, 9999);
		return rn;	
	}
}
