package DropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/dell/Desktop/single%20dropdown.html");
		
		//identify dropdown and store it in ref variable
		WebElement menuDropdown = driver.findElement(By.id("idd"));
		
		//get all the options of menuDropdown
		Select sel = new Select(menuDropdown);
		List<WebElement> allOps = sel.getOptions();
		
		//to eliminate duplicates we use hashset
		HashSet<String> hs = new HashSet<String>();
		
		//read all list by using for loop and eliminate duplicate
		for(int i=0;i<allOps.size();i++)
		{
			WebElement op = allOps.get(i);
			
			//get the text of webelement
			String dropdownOption = op.getText();
			
			//add the dropdown into the hashset and remove duplicate
			hs.add(dropdownOption);
				
		}
		
		Thread.sleep(2000);
		//read the options from hashset by using for each loop
		
		for(String opt:hs)
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}
		
	}

}
