package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		//identify dropdown option and click
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		//identify phone no dropdown it is single select
		WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150 w-5/12')]"));
		
		Select sel = new Select(dropdown1);
		Thread.sleep(2000);
		//select the option from single select dropdown
		sel.selectByIndex(2);
		
		//deselect the option from single select dropdown
		Thread.sleep(2000);
 // 	sel.deselectByIndex(2);
		
		//perform deselection on multiSelect Dropdown
		driver.navigate().to("file:///C:/Users/dell/Desktop/webelements/multi%20select%20dropdown.html");
		//identify dropdown that is multiSelect
		WebElement dropdown2 = driver.findElement(By.id("idddd"));
		
		Select sel2 = new Select(dropdown2);
		
		//select and deselect  option by using index
		Thread.sleep(2000);
		sel2.selectByIndex(2);
		Thread.sleep(2000);
		sel2.deselectByIndex(2);
		
		//select the deselect multiple option by using index
		for(int i=0;i<=4;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
		}
		//Thread.sleep(2000);
		
//		for(int i=0;i<=4;i++)
//		{
//			Thread.sleep(2000);
//			sel2.deselectByIndex(i)
//		}
		
		Thread.sleep(2000);
		//select the deselect option by using value
		sel2.selectByValue("v2");
		//	Thread.sleep(2000);
	      //sel2.deselectByValue("v2");
		
		//select and deselect option by using visible text
		sel2.selectByVisibleText("Misal");
		Thread.sleep(2000);
		//sel2.deselectByVisibleText("Misal");
		
		sel2.deselectAll();
		
		
		
		
		
		
		
		

		
	}

}
