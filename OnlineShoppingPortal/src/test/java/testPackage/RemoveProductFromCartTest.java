package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import pomPackage.CellphonesPage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

@Listeners(genericPackage.MyListener.class)
public class RemoveProductFromCartTest extends BaseTest{

	@Test
	public void removeProductFromCartTC_003() throws EncryptedDocumentException, IOException, InterruptedException {
        WelcomePage wp = new WelcomePage(driver);
        wp.getElectronicsLink().click();
        
        ElectronicsPage ep = new ElectronicsPage(driver);
        ep.getCellPhones().click();
        
        CellphonesPage cp = new CellphonesPage(driver);
        cp.getSmartPhoneAddToCartButton().click();
        
        wp.getShoppingCartLink().click();
        
        ShoppingCartPage sp = new ShoppingCartPage(driver);
        sp.getCheckboxForSmartphone().click();
        
        sp.getUpdateShoppingCartButton().click();

	}

}
