package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
 
  @Test(description = "Login Performed!!")
  public void loginMethod() {
	  Reporter.log("method1 for login page",true);
  }
  @Test(description = "userCreated",dependsOnMethods = "loginMethod")
  public void createUser() {
	  Reporter.log("method2 for user page",true);
  }

  @Test(description = "Logout Perform!!",dependsOnMethods = "createUser")
  public void logout() {
	  Reporter.log("method3 for logout page",true);
  }

}
