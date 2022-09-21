package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class PeopleSupp1 {
	WebDriver driver;
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
	ClickAction objj1=new ClickAction();
	public PeopleSupp1(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/a")
	public WebElement people;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/ul/li[3]/a/span")
	public WebElement suppliers;
	@FindBy(xpath="/html/body/div[2]/button")
	public WebElement addsuppliers;
	@FindBy(id="SupplierName")
	public WebElement suppliername;
	@FindBy(name="phone")
	public WebElement phn;
	@FindBy(id="SupplierEmail")
	public WebElement email;
	@FindBy(xpath="//*[@id=\"AddSupplier\"]/div/div/form/div[2]/button[2]")
	public WebElement submit;
	@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
	public WebElement search;
	 @FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
	 public WebElement iconbar;
	public void suppliersclick() throws Exception {
		objj1.clickUsingJS(driver, people);
		objwait.waitin();
		objj1.clickUsingJS(driver, suppliers);
		objwait.waitin();
		
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scroll(0,300);");
		  objwait.waitin();
		  js.executeScript("scroll(0,-300);");
		  objwait.waitin();
		  objj1.clickUsingJS(driver, addsuppliers);
			objwait.waitin();
		  
		  
	}
	public void addsuppliers() throws Exception {
		objj.sendKeys(driver,  suppliername, "Anujith");
		  objwait.waitin();
		  objj.sendKeys(driver,  phn, "7654227712");
		  objwait.waitin();
		  objj.sendKeys(driver,  email, "qwerty@gmail.com");
		  objwait.waitin();
		  objj1.clickUsingJS(driver, submit);
			objwait.waitin();
		
	}
	public void searchsupp() throws Exception {
		objj1.clickUsingJS(driver, search);
		objwait.waitin();
		
		objj.sendKeys(driver,  search, "Anujith");
		  objwait.waitin();
	
		objj1.clickUsingJS(driver, iconbar);
		objwait.waitin();
		
	}
}
