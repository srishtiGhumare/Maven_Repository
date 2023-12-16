package testNGAnnotations_Flags;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	 @Test(description = "Login Performed!!")
	  public void loginMethod() {
		  Reporter.log("method1 for login page",true);
	  }
	  @Test(description = "userCreated",dependsOnMethods = "loginMethod")
	  public void createUser() {
		  Assert.fail();
		  Reporter.log("method2 for user page",true);
	  }

	  @Test(description = "Logout Perform!!",dependsOnMethods = "createUser",alwaysRun = true)
	  public void logout() {
		  Reporter.log("method3 for logout page",true);
	  }

	}
