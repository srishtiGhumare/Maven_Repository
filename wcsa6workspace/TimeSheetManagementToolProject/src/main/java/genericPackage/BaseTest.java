package genericPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Flib implements IautoConstant{
	
	static WebDriver driver;
	
	@BeforeMethod

	public void setup()
	{
		//read data from config.properties file for browser and url
	Flib flib = new Flib();

	}
	

}
