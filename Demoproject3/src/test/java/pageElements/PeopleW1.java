package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ClickAction;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class PeopleW1 {
	WebDriver driver;
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
	ClickAction objj1=new ClickAction();
	public PeopleW1(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/a")
public WebElement people;
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[4]/ul/li[1]/a/span")
public WebElement waiters;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addwaiters;
@FindBy(id="WaiterName")
public WebElement waitersname;
@FindBy(id="WaiterPhone")
public WebElement phoneno;
@FindBy(name="store_id")
public WebElement waiterstore;
@FindBy(xpath="//*[@id=\"AddWaiter\"]/div/div/form/div[2]/button[2]")
public WebElement submit;
@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
public WebElement search;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;
//customers

	public void peoplewaiters() throws Exception {
		objj1.clickUsingJS(driver, people);
		objwait.waitin();
		objj1.clickUsingJS(driver, waiters);
		objwait.waitin();
		
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scroll(0,300);");
		  objwait.waitin();
		  js.executeScript("scroll(0,-300);");
		  objwait.waitin();
		  objj1.clickUsingJS(driver, addwaiters);
			objwait.waitin();
		  
		}
	public void addwaiters() throws Exception {
		 objj.sendKeys(driver, waitersname, "Amal");
		  objwait.waitin();
		  objj.sendKeys(driver, phoneno, "97523146780");
		  objwait.waitin();
	
		
	}
	public void waitersstore() throws Exception {
		Select wst=new Select(waiterstore);
		wst.selectByIndex(2);
		objwait.waitin();
		objj1.clickUsingJS(driver, submit);
		objwait.waitin();
		
	}
	
	public void waitersearch() throws Exception {
		//objj1.clickUsingJS(driver, search);
		search.click();
		objwait.waitin();
		objj.sendKeys(driver, search, "Amal");
		  objwait.waitin();
		
		objj1.clickUsingJS(driver, iconbar);
		objwait.waitin();
		
	}
	
	
}
