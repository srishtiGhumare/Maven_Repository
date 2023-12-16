package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the instagram
		driver.get("https://www.instagram.com");
		
		//read the title of login page
		String titleOfPage = driver.getTitle();

		System.out.println(titleOfPage);
		driver.close();


	}

}
