package KeywordDrivenFramework;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib{

	static WebDriver driver;
	public void openbrowser() throws IOException
	{
		Flib flib = new Flib();
		
		String browserValue = flib.readDataFromProperty("./src/main/resources/Config.properties", "Browser");
		String url = flib.readDataFromProperty("./src/main/resources/Config.properties", "Url");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Browser value is Invalid!!!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
		public void closeBrowser()
		{
		driver.quit();
		}
		
	}
