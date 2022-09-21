package pageElements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.reactivex.rxjava3.functions.Action;
import utilities.ClickAction;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class Expense1 {
	WebDriver driver;
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
	ClickAction objj1=new ClickAction();
	public Expense1(WebDriver driver) {
		this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[6]/a/span")
public WebElement expense;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addexpense;
@FindBy(id="Date")
public WebElement date;
@FindBy(name="reference")
public WebElement reference;
@FindBy(id="Amount")
public WebElement Amount;
@FindBy(id="Category")
public WebElement Category;
@FindBy(xpath="//*[@id=\"store_id\"]")
public WebElement store;
@FindBy(xpath="//*[@id=\"attachment\"]")
public WebElement attachment;
@FindBy(xpath="//*[@id=\"addform\"]/div[2]/button[2]")
public WebElement submit;
@FindBy(xpath="//*[@id=\"table_filter\"]/label/input")
public WebElement search;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;
public void expense() throws Exception {
	objj1.clickUsingJS(driver, expense);
	objwait.waitin();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scroll(0,300);");
	  objwait.waitin();
	  js.executeScript("scroll(0,-300);");
	  objwait.waitin();
	  objj1.clickUsingJS(driver, addexpense);
		objwait.waitin();
	 
}
public void addexpense() throws Exception {

	objj.sendKeys(driver,  reference, "876985");
	  objwait.waitin();
	  objj.sendKeys(driver,  Amount, "25");
	  objwait.waitin();
	  objj.sendKeys(driver,  date, "09/03/2022");
	 
	
	objwait.waitin();
}
public void dropdown() throws Exception {
	Select objdrop=new Select(Category);
	objdrop.selectByIndex(1);
	objwait.waitin();
	Select objdrop1=new Select(store);
	objdrop1.selectByIndex(2);
	objwait.waitin();
	objj1.clickUsingJS(driver, submit);
	objwait.waitin();
	
}
/*public void fileupload() throws InterruptedException, AWTException {
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();",attachment);
	
objwait.waitin();
	//Actions ac=new Actions(driver);
	//ac.click(attachment);
	attachment.click();
	objwait.waitin();
StringSelection ss = new StringSelection("\"C:\\Users\\jithi\\OneDrive\\Pictures\\IMG_3576.JPG\"");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
// imitate mouse events like ENTER, CTRL+C, CTRL+V
Robot robot = new Robot();
Thread.sleep(3000);
robot.delay(3000);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
robot.delay(3000);
robot.keyRelease(KeyEvent.VK_ENTER);
objwait.waitin();
	submit.click();
	objwait.waitin();
}*/
public void search() throws Exception {
	objj1.clickUsingJS(driver, search);
	objwait.waitin();
	
	objj.sendKeys(driver,  search, "876985");
	  objwait.waitin();
	  objj1.clickUsingJS(driver, iconbar);
		objwait.waitin();

}
}
