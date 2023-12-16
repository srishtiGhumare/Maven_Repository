package wcsa6MavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndFlow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		//get the address of parent window
		
		driver.findElement(By.xpath("//div[text() ='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		Thread.sleep(2000);
		

	}

}
