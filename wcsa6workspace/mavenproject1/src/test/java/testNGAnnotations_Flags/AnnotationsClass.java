package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void annotation_Test_Method() {
	  
	  Reporter.log("Test_Annotation", true);
  }
  
  @BeforeMethod
  public void annotation_BeforeMethod()
  {
	  Reporter.log("Before Method Annotation", true);
  }
  @BeforeClass
  public void annotation_BeforeClass()
  {
	  Reporter.log("BeforeClass_Annotation", true);
  }
  @AfterMethod
  public void annotation_AfterMethod()
  {
	  Reporter.log("AfterMethod_Annotation", true);
  }
  @AfterClass
  public void annotation_AfterClass()
  {
	  Reporter.log("AfterClass_Annotation", true);
  }
  @BeforeTest
  public void annotation_BeforeTest()
  {
	  Reporter.log("BeforeTest_Annotation", true);
  }
  @BeforeSuite
  public void annotation_BeforeSuite()
  {
	  Reporter.log("BeforeSuite_Annotation", false);
  }
}
