package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class Categories1 {
	WebDriver driver;
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
	ClickAction objj1=new ClickAction();
	public Categories1(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
		}
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/a")
public WebElement categories;
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/ul/li[1]/a/span")
public WebElement product;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addcategory;
@FindBy(id="CategoryName")
public WebElement categoryname;
@FindBy(xpath="//*[@id=\"Addcategory\"]/div/div/form/div[2]/button[2]")
public WebElement submit;
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/ul/li[2]/a/span")
public WebElement expense;
@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")
public WebElement search;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;
public void categories() throws Exception {
	objj1.clickUsingJS(driver, categories);
	objwait.waitin();
	objj1.clickUsingJS(driver, product);
	
	objwait.waitin();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scroll(0,300);");
	  objwait.waitin();
	  js.executeScript("scroll(0,-300);");
	  objwait.waitin();
	  objj1.clickUsingJS(driver, addcategory);
		objwait.waitin();
	  
	}
public void Addcategory() throws Exception {
	objj.sendKeys(driver,  categoryname, "fruits");
	  objwait.waitin();
	
	objj1.clickUsingJS(driver, submit);
	objwait.waitin();

	
}
public void search() throws Exception {
	objj1.clickUsingJS(driver, search);
	objwait.waitin();
	objj.sendKeys(driver,  search, "fruits");
	  objwait.waitin();
	
	
	
	objj1.clickUsingJS(driver, iconbar);
	objwait.waitin();
}

}
