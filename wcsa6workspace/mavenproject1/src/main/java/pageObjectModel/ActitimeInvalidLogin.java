package pageObjectModel;

import java.io.IOException;

public class ActitimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		//to open and close browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		//get the webelement from login page pom class
		LoginPage lp = new LoginPage(driver);
		//read data from excel sheet
		Flib flib = new Flib();
		//read Rowcount
		int rc = flib.rowCount(EXCEL_PATH, INVALIDCREDS_SHEET);
		
		for(int i=1;i<=rc;i++)
		{
			//get the method to perform invalid login from loginpage pom class
			lp.InvalidLogin(flib.readDataFromExcel(EXCEL_PATH, INVALIDCREDS_SHEET, i,0),flib.readDataFromExcel(EXCEL_PATH, CUSTOMER_PROJECT_SHEET, i,1));
		}
		bt.tearDown();
		


	}

}
