package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		//identify username text box and pass input
		driver.findElement(By.xpath("//input[contains(@name,'u')]")).sendKeys("");
		//identify password text box and pass inputs
		driver.findElement(By.xpath("//input[contains(@name,'p')]")).sendKeys("");
		
		//identify login button
		driver.findElement(By.xpath(""));
		
		


	}

}
