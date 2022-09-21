package pageElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ClickAction;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;


public class Login1 {
	WebDriver driver;
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
ClickAction objj1=new ClickAction();
	public Login1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		  PageFactory.initElements(driver, this); //initialization of pagefactory
		}
	 @FindBy(xpath="//*[@id=\"login-modal\"]/div/div/form/input[1]")
	 public WebElement Username;
	 @FindBy(xpath="//*[@id=\"login-modal\"]/div/div/form/input[2]")
	 public WebElement Password;
	 @FindBy(xpath="//*[@id=\"login-modal\"]/div/div/form/input[3]")
	 public WebElement login;
	 @FindBy(className="icon-bar")
	 public WebElement iconbar;

	 
	 
	 public void loginbutton1(String username, String pwd) throws Exception {
		 
		 objj.sendKeys(driver, Username, "admin");
	      objwait.waitin();
		 objj.sendKeys(driver, Password, pwd);
	      objwait.waitin();
	  //login.click();  
	     // objj1.click(login);
	      objj1.clickUsingJS(driver,login);
		   objwait.waitin();
		   Username.clear();
		  objwait.waitin();}
	 
	 public void loginbutton2() throws Exception {
		 
		  objj.sendKeys(driver, Username, "admin");
	      objwait.waitin();
		 objj.sendKeys(driver, Password, "password");
	      objwait.waitin();
	     //login.click();
	      objj1.clickUsingJS(driver, login);
	     objwait.waitin();
	     objj1.clickUsingJS(driver, iconbar);
		   //iconbar.click();
		    objwait.waitin();
		 

	
}}
