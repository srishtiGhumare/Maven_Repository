package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// use navigate method and launch the web application
		driver.navigate().to("https://www.google.com");
		
		//use navigate perform backword operation
		Thread.sleep(2000);
		driver.navigate().back();
		
		//use navigate perform forword operation
		driver.navigate().forward();
		
		// use navigate to perform refresh operation
		driver.navigate().refresh();
		

	}

}
