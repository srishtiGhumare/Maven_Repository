package MethodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
		//launch the Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-nleqf8o/login.do");
		
		//identify username text box
		WebElement usnTB = driver.findElement(By.name("username"));
		System.out.println(usnTB);
		usnTB.sendKeys("Admin");
		
		//identify password text box
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		System.out.println(passwordTB);
		passwordTB.sendKeys("manager");

	}

}
