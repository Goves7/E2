package testNGAnnotations2;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNGAnnotations2.MyListener.class)
public class AddToCartTC extends BaseTest {

	@Test
	public void addToCartTC_001() throws IOException, InterruptedException {
		
        WelcomePage wp = new WelcomePage(driver);
        wp.getElectronicsLink().click();
        
        ElectronicsPage ep = new ElectronicsPage(driver);
        ep.getCellPhones().click();
        
        CellphonesPage cp = new CellphonesPage(driver);
        cp.getSmartPhoneAddToCartButton().click();
        
        wp.getShoppingCartLink().click();
        
        ShoppingCartPage sp = new ShoppingCartPage(driver);
        if(sp.getSmartPhoneCartItem().isDisplayed())
        {
        	//System.out.println("Product is added to cart !!!");
        	Reporter.log("Product is added to cart !!!", true);
        }
        
        else
        {
        	//System.out.println("Product is not added to cart !!!");
        	Reporter.log("Product is not added to cart !!!", true);
        }
	}

}
