package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		//click on prompt
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		
		//generate prompt popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		//handle promt popup
		Thread.sleep(2000);
		Alert prompt = driver.switchTo().alert();
	//	al.accept();
		
		//get the text of prompt popup
	//	String textOfPrompt = prompt.getText();
   //		System.out.println(textOfPrompt);
		
		//send the response YES or NO
		Thread.sleep(2000);
		prompt.sendKeys("YES");
		
		
		//dismiss the promp popup
		Thread.sleep(2000);
		prompt.dismiss();
		

	}

}
