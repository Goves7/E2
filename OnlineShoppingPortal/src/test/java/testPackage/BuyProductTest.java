package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import genericPackage.WorkLib;
import pomPackage.CellphonesPage;
import pomPackage.CheckoutPage;
import pomPackage.ElectronicsPage;
import pomPackage.ShoppingCartPage;
import pomPackage.WelcomePage;

@Listeners(genericPackage.MyListener.class)
public class BuyProductTest extends BaseTest {

	@Test
	public void buyProductTC_002() throws IOException, InterruptedException {

        WelcomePage wp = new WelcomePage(driver);
        wp.getElectronicsLink().click();
        
        ElectronicsPage ep = new ElectronicsPage(driver);
        ep.getCellPhones().click();
        
        CellphonesPage cp = new CellphonesPage(driver);
        cp.getSmartPhoneAddToCartButton().click();
        
        wp.getShoppingCartLink().click();
        
        ShoppingCartPage scp = new ShoppingCartPage(driver);
        scp.getCheckboxForSmartphone().click();
        
        scp.getTermsOfServiceCheckbox().click();
        scp.getCheckoutButton().click();
        
        Flib flib = new Flib();
        String city = flib.readExcelData(TEST_EXCEL_PATH, BPD, 1, 0);
        String address1 = flib.readExcelData(TEST_EXCEL_PATH, BPD, 1, 1);
        String pincode = flib.readNumericExcelData(TEST_EXCEL_PATH, BPD, 1, 2);
        String phone= flib.readNumericExcelData(TEST_EXCEL_PATH, BPD, 1, 3);
        
        WorkLib wl = new WorkLib();
        int rn = wl.randomNumber();
       
        String phoneNo = phone+rn;
        
        CheckoutPage cop = new CheckoutPage(driver);
        cop.buyProductMethod(city, address1, pincode, phoneNo);
     

	}

}
