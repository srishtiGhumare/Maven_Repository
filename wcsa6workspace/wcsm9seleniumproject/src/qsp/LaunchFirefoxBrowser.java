package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// To launch firefox Browser create obj
				WebDriver driver = new FirefoxDriver();
				
				//maximize browser
				 driver.manage().window().maximize();
				
				//stop the execution of script for 2 sec
				Thread.sleep(2000);
				
				//close the browser by calling method of webdriver
				driver.close();
				


	}

}
