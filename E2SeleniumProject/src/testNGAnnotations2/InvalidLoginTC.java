package testNGAnnotations2;

import java.io.IOException;

public class InvalidLoginTC extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		Flib flib = new Flib();
	    int rc = flib.getLastRowCount(EXCEL_PATH, INVALIDCREDS);
	    
	    LoginPage lp = new LoginPage(driver);
	    
	    for(int i=1 ; i<=rc;i++)
	    {
	    	String email = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 0);
	    	String password = flib.readExcelData(EXCEL_PATH, INVALIDCREDS, i, 1);
	    	
	    	lp.invalidLoginMethod(email, password);
	    	
	    }

	}

}
