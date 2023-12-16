package AssignmentPackage;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("pass the browsername which you want");
		String browserValue = sc.next();

		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("this is not browservalue");
		}
		
		  	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		//serch for apple watches
		

	}

}
