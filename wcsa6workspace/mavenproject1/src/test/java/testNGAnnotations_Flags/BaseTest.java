package testNGAnnotations_Flags;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v117.indexeddb.model.Key;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class BaseTest {
 
	static WebDriver driver;

  public void setup() {
	  
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.google.com");
  }
  
  @AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
