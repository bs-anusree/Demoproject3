package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class Sales1 {
	WebDriver driver;
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
	ClickAction objj1=new ClickAction();
	public Sales1(WebDriver driver) {
	
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[5]/a/span")
	public WebElement sales;
	@FindBy(xpath="//*[@id=\"table_filter\"]/label/input")
	public WebElement search;
	 @FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
	 public WebElement iconbar;
	public void Sales() throws InterruptedException {
		sales.click();
		objwait.waitin();
		
		
	}
	public void Search() throws Exception {
		objj1.clickUsingJS(driver, search);
		objwait.waitin();
		objj.sendKeys(driver,  search, "John Doe");
		  objwait.waitin();

	objj1.clickUsingJS(driver, iconbar);
	objwait.waitin();
	
	}
}
