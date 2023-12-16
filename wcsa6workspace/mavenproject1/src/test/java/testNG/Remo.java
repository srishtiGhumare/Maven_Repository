package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method1() {
	 // System.out.println("method1 from remo class!!!");
	  Reporter.log("method1 from remo class!!!", true);
  }
  @Test
  public void method2()
  {
	Reporter.log("method2 from remo class!!!", true);  
  }
}
