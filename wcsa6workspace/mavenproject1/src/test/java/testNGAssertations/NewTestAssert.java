package testNGAssertations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestAssert {
  @Test
  public void assertMethod() {
	  
	  Reporter.log("Launch Browser!!", true);
	  Reporter.log("Launch WebApplication by using URL", true);
	  
	  Reporter.log("verify and validate the loginPage", true);
	  //Apply soft assert
	 SoftAssert sa = new SoftAssert();
	 sa.assertEquals(true, true);//soft assert
	 Reporter.log("login performed!!", true);
	 
	 Reporter.log("Verify and Validate the HomePage", true);
	 //Apply HardAssert
	 Assert.assertEquals(true, true);
	 Reporter.log("user created!!", true);
	 Reporter.log("Task Created!!", true);
	 
	 sa.assertAll();
  }
}
