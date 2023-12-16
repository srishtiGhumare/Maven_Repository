package wcsa6MavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubD
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();

	}

}
