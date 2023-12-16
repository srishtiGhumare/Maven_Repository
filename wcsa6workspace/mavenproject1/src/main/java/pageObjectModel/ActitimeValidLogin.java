package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class ActitimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
	     //to open and close browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		//get webelement from login page pom class
		LoginPage lp = new LoginPage(driver);
		//read data from property file
		Flib flib = new Flib();
		lp.validLogin(flib.readDataFromProperty(PROP_PATH, "Username"),flib.readDataFromProperty(PROP_PATH, "Password"));
		Thread.sleep(2000);
		bt.tearDown();
				

	}

}
