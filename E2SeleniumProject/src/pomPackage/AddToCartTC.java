package pomPackage;

import java.io.IOException;

public class AddToCartTC extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
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
        if(sp.getSmartPhoneCartItem().isDisplayed())
        {
        	System.out.println("Product is added to cart !!!");
        }
        
        else
        {
        	System.out.println("Product is not added to cart !!!");
        }
	}

}
