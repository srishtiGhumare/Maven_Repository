package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority = 3)
  public void f() {
	  Reporter.log("f");
  }
  
  @Test(priority = 3)
  public void P()
  {
	  Reporter.log("p");
  }
  
  @Test(priority = 0)
  public void s()
  {
	  Reporter.log("s"); 
  }
  
  @Test(priority = 0)
  public void k()
  {
	  Reporter.log("k"); 
  }
  
  @Test(priority = 1)
  public void a()
  {
	  Reporter.log("a");  
  }
  
  @Test(priority = 4)
  public void h()
  {
	  Reporter.log("h");  
  }
}
