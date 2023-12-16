package PopupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//apply implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				
				//Launch the web application
				driver.get("https://www.flipkart.com/");
				
				Thread.sleep(2000);
				
				//handle the popup
				WebElement hiddenDivisionPopup = driver.findElement(By.xpath("//span[text()='✕']"));
				hiddenDivisionPopup.click();

	}

}
