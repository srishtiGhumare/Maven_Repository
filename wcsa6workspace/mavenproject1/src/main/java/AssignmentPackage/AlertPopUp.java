package AssignmentPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		//click on ClickToAlertPopup
		driver.findElement(By.id("alert1")).click();
		
		//handle the popup
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		//accept alert popup
		Thread.sleep(2000);
		alert.accept();

	}

}
