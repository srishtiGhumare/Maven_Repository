package DropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/dell/Desktop/single%20dropdown.html");
	
		//single select dropdown
		WebElement dropDown1 = driver.findElement(By.id("idd"));
		
		//handle dropdown
		Select sel = new Select(dropDown1);
		
		//get all the options from dropdown by using getWrappedElement
		WebElement allOps = sel.getWrappedElement();
		System.out.println(allOps.getText());
		
		//get all the options from dropdown by using getOptions
		List<WebElement> options = sel.getOptions();
		
		for(WebElement opt:options)
		{
			Thread.sleep(2000);
			if(opt.getText().equals("vadapav"))
			{
				opt.click();
				break;
			}
			
		}

	}

}
