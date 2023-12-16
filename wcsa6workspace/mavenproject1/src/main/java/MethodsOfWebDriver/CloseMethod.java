package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Parent Browser
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				//Launch the web application
				driver.get("http://omayo.blogspot.com/");
				Thread.sleep(2000);
				
				//launch the child browser
				driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
				
				//use the close method
				driver.close();

	}

}
