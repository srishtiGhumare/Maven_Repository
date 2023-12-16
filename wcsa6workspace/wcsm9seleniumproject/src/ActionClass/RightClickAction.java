package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		//click on Button 
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		//click on right click link
		driver.findElement(By.partialLinkText("Right Click")).click();
		
		//
		WebElement rightClick1 = driver.findElement(By.xpath("//button[text()='Right Click']"));
		WebElement rightClick2 = driver.findElement(By.xpath("//button[text()='Right Click']"));
		WebElement rightClick3 = driver.findElement(By.xpath("//button[text()='Right Click']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(rightClick1).perform();
		Thread.sleep(2000);
		act.contextClick(rightClick2).perform();
		Thread.sleep(2000);
		act.contextClick(rightClick3).perform();


	}

}
