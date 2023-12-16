package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		//click on Disable mode
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		
		//explicit typecasting into javascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//handle disable name textbox
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('name').value='srushti'");
		
		//handle disable Email text box
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('email').value='ghumaresrushti00@gmail.com'");
		
		//Handle disable Password text box
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('password').value='srish5500'");
		
		//click on disable register button
		WebElement disableRegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
		
		if(disableRegisterButton.isDisplayed())
		{
			jse.executeScript("arguments[0].click()", disableRegisterButton);
			jse.executeScript("arguments[0].click()", "//span[text()='Login']");
			System.out.println("Click");
		}
		else
		{
			System.out.println("Not Click");
		}
		


	}

}
