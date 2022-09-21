package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class Stores1 {
	 WebDriver driver;
	 Waitconditions objwait=new Waitconditions();
	 SendKeysActionHelper objj=new SendKeysActionHelper();
		ClickAction objj1=new ClickAction();
	public Stores1(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[3]/a/span")
	public WebElement stores;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addstores;
@FindBy(id="StoreName")
public WebElement storename;
@FindBy(name="email")
public WebElement email;

@FindBy(id="StorePhone")
public WebElement storephone;
@FindBy(name="country")
public WebElement country;
@FindBy(xpath="//*[@id=\"AddStore\"]/div/div/form/div[2]/button[2]")
public WebElement submit;
@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
public WebElement search;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;
	public void storesbutton1() throws Exception {
		objj1.clickUsingJS(driver, stores);
		objwait.waitin();
		
	
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("scroll(0,300);");
		  objwait.waitin();
		  js.executeScript("scroll(0,-300);");
		  objwait.waitin();
			objj1.clickUsingJS(driver, addstores);
			objwait.waitin();
		
	}
	
	public void storesbutton2() throws Exception {
		objj.sendKeys(driver, storename,"AKStores");
		objwait.waitin();
		objj.sendKeys(driver, email,"angelina123@gmail.com");
		objwait.waitin();
		objj.sendKeys(driver, storephone,"9123456722");
		objwait.waitin();
		objj.sendKeys(driver, country,"India");
		objwait.waitin();
		objj1.clickUsingJS(driver, submit);
		objwait.waitin();
			 
	}
	
	
	public void storesbutton3() throws Exception {
		objj1.clickUsingJS(driver, search);
		objwait.waitin();
		objj.sendKeys(driver, search,"AKStores");
		objwait.waitin();
		
		objj1.clickUsingJS(driver, iconbar);
		objwait.waitin();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
