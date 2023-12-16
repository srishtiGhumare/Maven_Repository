package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com");
		
		//click on google app
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		//before clicking on maps switch control to frame
		//identify frame and store it as Webelement
		WebElement frameElement = driver.findElement(By.name("app"));
		
		Thread.sleep(2000);
		//driver.switchTo().frame(1);//int index
		//driver.switchTo().frame("app");//string name or id
		driver.switchTo().frame(frameElement);//webElement FrameElement
		
		Thread.sleep(2000);
		//click on google map
		driver.findElement(By.xpath("//span[text()='Maps']")).click();

	}

}
