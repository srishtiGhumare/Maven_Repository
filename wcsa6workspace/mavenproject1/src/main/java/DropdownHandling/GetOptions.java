package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		
		//click on dropdown text
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//identify phone no dropdown
		WebElement PhnoDropdown = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		Thread.sleep(2000);
		
		//get all the options present insite ph.no dropdown
		Select sel = new Select(PhnoDropdown);
		
		List<WebElement> allOps = sel.getOptions();
		
		//we read list by using for loop
	//	for(int i=0;i<allOps.size();i++)
	//	{
	//		String opt = allOps.get(i).getText();
	//		Thread.sleep(2000);
	//		System.out.println(opt);
	//	}
		
		//we read list by using for each loop
		for(WebElement op:allOps)
		{
			String opt1 = op.getText();
			Thread.sleep(2000);
			System.out.println(opt1);
			
		}
	}

}
