package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraEndToEndFlow {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']"));
		
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		
		//apply explicit wait
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("Che")));
 	//ele.click();
		
		driver.findElement(By.id("Check")).click();
	}
		
		

	}

