package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		//identify Dropdown option and click 
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
	    //identify phone no dropdown
	    WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,' transition-all duration-150 w-5/12')]"));
	    Thread.sleep(2000); 
	    Select sel1 = new Select(dropdown1);
	    Thread.sleep(2000);
	    //select the options
	    sel1.selectByIndex(2);
	
	    //identify country dropdown
	    WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	    Thread.sleep(2000);
	    Select sel2 = new Select(dropdown2);
	    sel2.selectByValue("India");
	
	    //identify state dropdown
	    WebElement dropdown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
	    Select sel3 = new Select(dropdown3);
	    Thread.sleep(2000);
	    sel3.selectByVisibleText("Maharashtra");
	    
	    
	}

}
