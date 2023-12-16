package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 WebDriver driver = new EdgeDriver();
	 
	 //maximize the browser
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 
	 //close 
	 driver.close();

	}

}
