package AssignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndFlow {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browsers
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Launch the web application
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//handle the popup
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		//search for laptop in search box
		driver.findElement(By.name("q")).sendKeys("laptop");
		//click on search icon
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		
		//click on Brand and select HP
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		Thread.sleep(2000);
		
		//click on type and select the laptop
		driver.findElement(By.xpath("//div[text()='Type']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Laptop']")).click();
		Thread.sleep(2000);
		
		//click on processor and select core i9
		driver.findElement(By.xpath("//div[text()='Processor']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i9']")).click();
		Thread.sleep(2000);
		
		//click on os
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		//click on window 11
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		
		//click on customer Rating
		driver.findElement(By.xpath("//div[text()='Customer Ratings']")).click();
		Thread.sleep(2000);
		//click on 4*&above
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
		Thread.sleep(2000);
	
		

	}

}
