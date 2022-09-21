package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.reactivex.rxjava3.functions.Action;
import utilities.ClickAction;
import utilities.Waitconditions;

public class Settings1 {
WebDriver driver;
Waitconditions objwait=new Waitconditions();
ClickAction objj1=new ClickAction();
	public Settings1(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[8]/a/span")
public WebElement setting;
@FindBy(xpath="//*[@id=\"logo\"]")
public WebElement choosefile;
@FindBy(xpath="//*[@id=\"setting\"]/form/div[15]/button")
public WebElement submit;
@FindBy(xpath="//*[@id=\"users\"]/button")
public WebElement users;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;
public void Setting() throws Exception {
	setting.click();
	objwait.waitin();
	Actions ac=new Actions(driver);
	ac.click(choosefile);
//    objwait.waitin();
    submit.click();
    objwait.waitin();
    objj1.clickUsingJS(driver, iconbar);
	objwait.waitin();
}


}
