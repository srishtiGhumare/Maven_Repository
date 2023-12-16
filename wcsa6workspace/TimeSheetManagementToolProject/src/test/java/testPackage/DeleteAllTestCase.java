package testPackage;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomeListener.class)

public class DeleteAllTestCase extends BaseTest{
  @Test
  public void deleteMethod() {
	  //read the data from property filr
	  Flib flib = new Flib();
	  
	  //login page
	 LoginPage lp = new LoginPage(Driver);
	 
	 
  }
}
