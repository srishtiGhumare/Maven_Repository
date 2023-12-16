package AssignmentPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browsers
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//apply implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Launch the web application
				driver.get("https://www.flipkart.com/");
				
				//handle the popup
				driver.findElement(By.xpath("//span[text()='✕']")).click();
				//search for laptop in search box
				driver.findElement(By.name("q")).sendKeys("laptop");
				//click on search icon
				driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
				
				//click on Brand and select HP
				driver.findElement(By.xpath("//div[text()='Brand']")).click();
				driver.findElement(By.className("_3879cV")).click();
				//click on processor and select corei7
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
				//click on os and select window11
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='Operating System']")).click();
				driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
				//select 4 and above ratings from customer ratings
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
				
				//identify the name of the laptops
				List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T' and (text()='HP Victus Core i7 12th Gen 12650H - (16 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce RTX...')]"));
				//identify the price of the laptop
				List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
				for(int i=0;i<allLaptops.size();i++)
				{
					String laptop = allLaptops.get(i).getText();
					Thread.sleep(2000);
			
				
				for(int j=i;j<=i;j++)
				{
					String price = allPrices.get(j).getText();
					Thread.sleep(2000);
					System.out.println(laptop+"  : "+ price);
				}
				}
				
				

	}

}
