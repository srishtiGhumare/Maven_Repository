package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {
	
	//store all the webelements of Taskpage
	
	@FindBy(partialLinkText = "Projects & Customers")
	private WebElement Projects_Customers_Sub_module;
	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement Create_New_Customer_Button;
	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement Create_New_Project_Button;
	
	@FindBy(name = "name")
	private WebElement Customer_nameTB;
	@FindBy(name = "createCustomerSubmit")
	private WebElement CreateCutomer_button;
	
	@FindBy(name = "customerId")
	private WebElement Customer_name_dropdown;
	@FindBy(name = "name") 
	private WebElement Project_nameTB;
	@FindBy(name = "createProjectSubmit")
	private WebElement Create_Project_Button;
	
	//INITIALIZATION
	public TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//UTILIZATION
	public WebElement getProjects_Customers_Sub_module() {
		return Projects_Customers_Sub_module;
	}

	public WebElement getCreate_New_Customer_Button() {
		return Create_New_Customer_Button;
	}

	public WebElement getCreate_New_Project_Button() {
		return Create_New_Project_Button;
	}

	public WebElement getCustomer_nameTB() {
		return Customer_nameTB;
	}

	public WebElement getCreateCutomer_button() {
		return CreateCutomer_button;
	}

	public WebElement getCustomer_name_dropdown() {
		return Customer_name_dropdown;
	}

	public WebElement getProject_nameTB() {
		return Project_nameTB;
	}

	public WebElement getCreate_Project_Button() {
		return Create_Project_Button;
	}
	
	//OPERATIONAL METHOD
	public void createCustomer_createProject_Method(String cust_name,String pro_name) throws InterruptedException
	{
		Projects_Customers_Sub_module.click();
		Thread.sleep(1000);
		Create_New_Customer_Button.click();
		Thread.sleep(1000);
		 Customer_nameTB.sendKeys(cust_name);
		 CreateCutomer_button.click();
		 Thread.sleep(1000);
		 Create_New_Project_Button.click();
		Select sel = new Select(Customer_name_dropdown);
		sel.selectByVisibleText(cust_name);
		 Thread.sleep(1000);
		 Project_nameTB.sendKeys(pro_name);
		 Create_Project_Button.click();
		 
		 
		 
		 
		
		
	}
	
	
	
	
	
	
	
	

}
