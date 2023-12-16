package PopupHandling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthentificationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		//generate Authentification popup
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		
		//address of authentification page window
		String authPageWindowHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		//get the address of all present windows
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		//shift control to authentification popup window page
		for(String wh:allWindowHandles)
		{
			if(authPageWindowHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			Thread.sleep(2000);
			//handle authentification popup
			
		}
		
	
		

	}

}
