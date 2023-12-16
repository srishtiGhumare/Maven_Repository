package PopupHandling;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the browser value");
	       String browserValue = sc.next();
	       
	       if(browserValue.equalsIgnoreCase("Chrome"))
	       {
	    	  ChromeOptions co = new ChromeOptions();
	    	  co.addArguments("---disable-notifications");
	    	  
	    	  new ChromeDriver(co);
	       }
	       else if(browserValue.equalsIgnoreCase("Firefox"))
	       {
	    	  FirefoxOptions fo = new FirefoxOptions();
	    	  fo.addArguments("---disable-notifications");
	       }


	}

}
