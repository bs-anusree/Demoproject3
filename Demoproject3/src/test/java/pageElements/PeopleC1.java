package pageElements;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.ReadExcelXFileNew;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class PeopleC1 {
	WebDriver driver;
	ReadExcelXFileNew objexcel = new ReadExcelXFileNew();
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
	ClickAction objj1=new ClickAction();
	public PeopleC1(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/a")
	public WebElement people;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/ul/li[2]/a/span")
	public WebElement customers;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addcustomers;
	@FindBy(name="name")
	public WebElement customername;
	
	@FindBy(id="CustomerPhone")
	public WebElement customerphn;
	@FindBy(id="CustomerEmail")
	public WebElement customeremail;
	@FindBy(name="discount")
	public WebElement customerdisc;
	@FindBy(xpath="//*[@id=\"AddCustomer\"]/div/div/form/div[2]/button[2]")
	public WebElement submit;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	 @FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
	 public WebElement iconbar;
	public void customersclick() throws Exception {
		objj1.clickUsingJS(driver, people);
		objwait.waitin();
		objj1.clickUsingJS(driver, customers);
		objwait.waitin();
		 
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scroll(0,300);");
		  objwait.waitin();
		  js.executeScript("scroll(0,-300);");
		  objwait.waitin();
		  objj1.clickUsingJS(driver,addcustomers);
			objwait.waitin();
		  
	}
	public void addcustomers() throws Exception {
		 objj.sendKeys(driver, customername, "Ancy");
		  objwait.waitin();
		  objj.sendKeys(driver,  customerphn, "9763748881");
		  objwait.waitin();
		  objj.sendKeys(driver,   customeremail,objexcel.ReadExcelXFileNew(0, 0));
		  objwait.waitin();
		 //customeremail.sendKeys(objexcel.ReadExcelXFileNew(0, 0));
		  objj.sendKeys(driver,  customerdisc, "3");
		  objwait.waitin();
		
		 objj1.clickUsingJS(driver, submit);
			objwait.waitin();
		
	}
	public void search() throws Exception {
		objj1.clickUsingJS(driver, search);
		objwait.waitin();
		objj.sendKeys(driver,  search, "Ancy");
		  objwait.waitin();
		 
		 objj1.clickUsingJS(driver, iconbar);
			objwait.waitin();
	
	}
}
