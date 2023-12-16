package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActitimeValidLogin  extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Launch the Browser
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		
		//read the data from property file
		Flib flib = new Flib();
		
		bt.openbrowser();
		
		//identify username Text box
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readDataFromProperty("./src/main/resources/Config.properties","username"));
		//identify password text box
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("./src/main/resources/Config.Properties","password");
		//identify login button and click
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		bt.closeBrowser();
	}

}
