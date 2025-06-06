package pomPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class RemoveProductFromCartTC extends BaseTest{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
        bt.browserSetup();
        
        WelcomePage wp = new WelcomePage(driver);
        wp.getLoginLink().click();
        
        Flib flib = new Flib();
        String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
        String password = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);
        
        LoginPage lp = new LoginPage(driver);
        lp.validLoginMethod(email, password);
        
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
