package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		//identify the link to lauch the child browser
		driver.findElement(By.linkText("Open a popup window")).click();
		//close the browser
		driver.close();
		

	}

}
