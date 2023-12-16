package AssignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneRobotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		//handle the popup
		driver.findElement(By.id("denyBtn")).click();
		//identify watch jewwelary
		WebElement watchJewellary = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		//click on band
		Actions act = new Actions(driver);
		act.moveToElement(watchJewellary).perform();
		
		
		
		

	}

}
