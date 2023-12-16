package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//handle hidden division pop up
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//identify search box and click
		driver.findElement(By.name("q")).sendKeys("mobiles");
		Thread.sleep(2000);
		//search icon
		
		

	}

}
