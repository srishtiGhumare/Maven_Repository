package ActionClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		//handle popup
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement coinsTarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
		
		Thread.sleep(2000);
		
		//use action class for mouseHover
		Actions act = new Actions(driver);
		act.moveToElement(coinsTarget).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		
		if(driver.findElement(By.xpath("//h1[text()=' Lakshmigoldcoins ']")).isDisplayed())
		{
			System.out.println("Text Displayed!!");
		}
		else
		{
			System.out.println("Text is Not Displayed!!");
		}
		


	}

}
