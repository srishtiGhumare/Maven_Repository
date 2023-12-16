package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {
	
	//Explicit type cast into TakesScreenShot(I)

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev");
		
		//take screnshot of the  webpage
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    //call the method
  	    File src = ts.getScreenshotAs(OutputType.FILE);
		//Define way for storing ss
  	    File dest = new File("./ScreenShots/seleniumss.png");
  	    
  	    //store the screenshot in dest
  	    Files.copy(src, dest);
  	    
  	    

	}

}
