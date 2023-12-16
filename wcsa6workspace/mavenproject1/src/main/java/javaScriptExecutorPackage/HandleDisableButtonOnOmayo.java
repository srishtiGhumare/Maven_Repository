package javaScriptExecutorPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableButtonOnOmayo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		WebElement disableTextBox = driver.findElement(By.id("tb2"));
		
		//get the location of webelement
		Point loc = disableTextBox.getLocation();
		int xaxis= loc.getX();
		int yaxis= loc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-40)+")");
		
		jse.executeScript("document.getElementId('tb2').value='Automation Testing'");
		Thread.sleep(2000);
		File src = disableTextBox.getScreenshotAs(OutputType.FILE);
		File dest = new File("ScreenShots/disableTextBox.jpg");
		
		
		
		
		
		
		
	}

}
