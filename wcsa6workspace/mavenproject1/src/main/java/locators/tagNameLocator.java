package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameLocator {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/dell/Desktop/New%20folder/loginpage.html");
	
	//identify username textbox by using tagName locator
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Admin");
	
	//identify Password testbox by using tagName locator
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Manager");

	}

}

