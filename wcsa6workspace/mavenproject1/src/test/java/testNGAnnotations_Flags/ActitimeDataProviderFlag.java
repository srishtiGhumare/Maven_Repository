package testNGAnnotations_Flags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActitimeDataProviderFlag {
  
	
	static WebDriver driver;
  public void invalidLoginMethod(String usn,String pass) {
	  
	 driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://desktop-nleqf8o/login.do");
	 
	driver.findElement(By.name("username")).sendKeys(usn);
	 driver.findElement(By.name("pwd")).sendKeys(pass);
	 driver.findElement(By.id("loginButton")).click();
	 driver.findElement(By.name("username")).clear();
  }
  
  @DataProvider(name="TestData")
  public Object[][] actiTimeTestdata() {
	Object[][] testdata = new Object[5] [2];
	
	testdata [0][0]="ad_min";
	testdata [0][1]="mana_ger";
	
	testdata [1][0]="ad123";
	testdata [1][1]="mana123";
	
	testdata [2][0]="456min";
	testdata [2][1]="456ger";
	
	testdata [3][0]="min";
	testdata [3][1]="add";
	
	testdata [4][0]="manager";
	testdata [4][1]="admin";
	
	return testdata;
	
  }
}
