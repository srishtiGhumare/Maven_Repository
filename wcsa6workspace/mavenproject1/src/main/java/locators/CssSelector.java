package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label*='username']")).sendKeys("srushti");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='p']")).sendKeys("123455");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type$='it']")).click();

	}

}
