package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActitimeInvalidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//To launch the Browser and close the Browser
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		
		//To read the data from Excel file
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resources/ActitimeTestData.xlsx","invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			//identify username text box
			WebElement usnTB = driver.findElement(By.name("username"));
			usnTB.sendKeys(flib.readDataFromExcel(null,null , i, 0));
			//identify password text box
			WebElement passTB = driver.findElement(By.name("pwd"));
			passTB.sendKeys(flib.readDataFromExcel(null, null, i, 1));
			//identify login button and click
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();
	}

}
