package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/dell/Desktop/single%20dropdown.html");
	
		//single select dropdown
		WebElement dropDown1 = driver.findElement(By.id("idd"));
		
		//handle the dropdown
		Select sel = new Select(dropDown1);
		Thread.sleep(2000);
		//select the option from dropdown
		sel.selectByValue("v7");
		
		//get the option which is selected first
		WebElement firstOpt = sel.getFirstSelectedOption();
		//get the text of firstopt
		System.out.println(firstOpt.getText());
		
		//Multi select dropdown
		driver.navigate().to("file:///C:/Users/dell/Desktop/webelements/multi%20select%20dropdown.html");
		
		//identify dropdown
		WebElement dropDown2 = driver.findElement(By.id("iddd"));
		
		//handle the multi select dropdown
		Select sel2 = new Select(dropDown2);
		
		//select multiple option from multi select dropdown
		for(int i=5;i<8;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
		}
		
		//get option which is selected first
		Thread.sleep(2000);
		System.out.println(sel2.getFirstSelectedOption().getText());
		
		
		

	}

}
