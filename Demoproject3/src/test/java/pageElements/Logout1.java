package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class Logout1 {
	WebDriver driver;
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
	ClickAction objj1=new ClickAction();
	public Logout1(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="bs-example-navbar-collapse-1")
	public WebElement swipedown;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[2]/li[3]/a/i")
	public WebElement logout;
	public void logoutfn() throws Exception {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
       
        // Scrolling down the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", swipedown);
objwait.waitin();
		
		  objj1.clickUsingJS(driver, logout);
			objwait.waitin();
	}
}
