package PopupHandling;

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
		
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		//generate alert popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		//Handle Alert popup
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		//accept alert popup
		Thread.sleep(2000);
	//	alert.accept();
		
		//get the text of alert popup
		String textOfAlert = alert.getText();
		System.out.println(textOfAlert);
		
		//Elements are not present there so it will not work and we will get the exception
	//	alert.sendKeys("srishti");
		
		// Dismiss Alert popup
		alert.dismiss();
		
		
		


	}

}
