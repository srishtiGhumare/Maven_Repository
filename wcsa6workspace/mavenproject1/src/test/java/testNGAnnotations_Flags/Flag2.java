package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
  @Test(description = "It is use to Perform Login!!",enabled = true)
  public void method1() {
	  Reporter.log("method1 for Login Page", true);
  }
  
  @Test(description = "It is use to create user!!",enabled = true)
  public void method2()
  {
	  Reporter.log("method2 for User Page", true);
  }
  
  @Test(description = "It is use to Perform Logout!!",enabled = true)
  public void method3()
  {
	  Reporter.log("method3 for Logout page", false);
  }
}
