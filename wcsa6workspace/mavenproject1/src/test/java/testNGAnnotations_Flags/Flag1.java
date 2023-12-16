package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
  @Test(description = "This perform Login Operation")
  public void method1() {
	  Reporter.log("method1 from flag1", true);
  }
  
  
}
