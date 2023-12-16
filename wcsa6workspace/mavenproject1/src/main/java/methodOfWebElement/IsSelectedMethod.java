package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	//verify check box on login page
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-nleqf8o/login.do");
		
		//identify check box for verify
		WebElement checkBoxElement = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		//check the chech box is selected or not
		boolean status = checkBoxElement.isSelected();
		
		//check the check box 
		

		


	}

}
