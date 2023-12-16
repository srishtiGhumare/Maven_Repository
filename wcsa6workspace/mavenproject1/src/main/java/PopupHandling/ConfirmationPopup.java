package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		//click on confirmation link
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		//generate confirmation popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		//handle confirmation popup
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		//accept confirmation popup
	//	al.accept();
		
		//print the text of confirmation popup
		String textOfConfirmation = al.getText();
		System.out.println(textOfConfirmation);
		
	//it will not accept sendkeys so we will get ElementNotInteractebleException
	//	al.sendKeys("srishti");
		
		//dismiss confirmation popup
		al.dismiss();

	}

}
