package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//lauch the Actitime
		driver.get("http://127.0.0.1/login.do");
		
		//read the URL of login page
		String urlofLoginPage = driver.getCurrentUrl();
		System.out.println(urlofLoginPage);

	}

}
