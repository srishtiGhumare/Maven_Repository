package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://127.0.0.1/login.do");
		  String loginPageSourceCode = driver.getPageSource();
		  System.out.println(loginPageSourceCode);
		  driver.close();

	}

}
