package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove");
		
		//explicit typecast into javaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(int i=0;i<2;i++)
		{
			jse.executeScript("window.scrollBy(5000,0)");
		}
		
		//perform scrollLeft
		jse.executeScript("window.scrollBy(-5000,0)");
		

	}

}
