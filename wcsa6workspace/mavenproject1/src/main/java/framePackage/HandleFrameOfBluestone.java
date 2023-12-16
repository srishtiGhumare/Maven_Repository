
package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfBluestone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");

		//handle the popup
	    driver.findElement(By.id("denyBtn")).click();
	    
	    //switch the control to frame
	    //identify frame and store it is a webElement
	    WebElement frameElement = driver.findElement(By.id("fc_widget"));
	  //  driver.switchTo().frame(6);//int index
	  //  driver.switchTo().frame("fc_widget");//string name or id
	    driver.switchTo().frame(frameElement);//webElement FrameElement
	    
	    
	    Thread.sleep(2000);
	    
	    //click on chat box
	    driver.findElement(By.id("chat-icon")).click();
	    
	    //handle all the text box present inside chat box
	    //all the text box are designed under main webpage so switch back to main webpage
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("chat-fc-name")).sendKeys("srishti");
	    driver.findElement(By.id("chat-fc-email")).sendKeys("srushtig00@gmail.com");
	    driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
	    driver.findElement(By.partialLinkText("Start Chat")).click();;
		

	}

}
