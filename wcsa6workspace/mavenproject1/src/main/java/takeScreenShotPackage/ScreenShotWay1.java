package takeScreenShotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {
	
	//directly create object for browser specific classes

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		//take screenshot of demoapp
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("ScreenShots/demoapp.png");
		Files.copy(src, dest);
		

	}

}
