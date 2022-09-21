package pageElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ClickAction;
import utilities.SendKeysActionHelper;
import utilities.Waitconditions;

public class Addpdt1 {
	WebDriver driver;
	Waitconditions objwait=new Waitconditions();
	SendKeysActionHelper objj=new SendKeysActionHelper();
	ClickAction objj1=new ClickAction();
public Addpdt1(WebDriver driver) {
	this.driver = driver;
	  PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[2]/a/span")
public WebElement pdt;
@FindBy(xpath="/html/body/div[2]/button")
public WebElement addpdt;
@FindBy(id="Type")
public WebElement addpdt1;
@FindBy(id="Category")
public WebElement addpdt2;
@FindBy(name="supplier")
public WebElement addpdt3;
@FindBy(name="code")
public WebElement addpdt4;
@FindBy(id="ProductName")
public WebElement addpdt5;
@FindBy(id="taxType")
public WebElement addpdt6;

@FindBy(id="Tax")
public WebElement addpdt8;
@FindBy(name="unit")
public WebElement addpdt9;
@FindBy(xpath="//*[@id=\"ImageInput\"]") //choose button
public WebElement addpdt10;
@FindBy(xpath="//*[@id=\"addform\"]/div[2]/button[2]") // submitbutton
public WebElement addpdt11;
@FindBy(id="Price")  
public WebElement addpdt12;
/*@FindBy(xpath="//*[@id=\"PurchasePrice\"]")
public WebElement addpdt7;
@FindBy(xpath="//*[@id=\"AlertQt\"]")
public WebElement addpdt13;*/
@FindBy(id="quantity")
public WebElement addpdt14;
@FindBy(xpath="//*[@id=\"stockModal\"]/div/div[3]/button[2]") //submit
public WebElement addpdt15;
@FindBy(xpath="//*[@id=\"Table_filter\"]/label/input")//search
public WebElement addpdt16;
@FindBy(xpath="/html/body/nav/div/div[1]/button/span[3]")
public WebElement iconbar;
public void pdtbutton() throws Exception {
	objj1.clickUsingJS(driver, pdt);
	objwait.waitin();
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scroll(0,300);");
	  
	  js.executeScript("scroll(0,-300);");
	objj1.clickUsingJS(driver, addpdt);
	objwait.waitin();
		
	 }
public void pdtbutton1() throws InterruptedException {
	
	
	Select objdrop=new Select(addpdt1);
	objdrop.selectByIndex(0);
	objwait.waitin();
	  Select objdrop1=new Select(addpdt2);
		objdrop1.selectByIndex(1);
		objwait.waitin();
		  Select objdrop2=new Select(addpdt3);
			objdrop2.selectByValue("agmark");
			objwait.waitin();
			  Select objdrop3=new Select(addpdt6);
				objdrop3.selectByVisibleText("exclusive");
				  
	
}
public void pdtbutton2() throws Exception {
	
	objj.sendKeys(driver, addpdt4,"3");
	objwait.waitin();
	objj.sendKeys(driver, addpdt5,"Ryan");
	objwait.waitin();
	objj.sendKeys(driver, addpdt6,"2");
	objwait.waitin();
	objj.sendKeys(driver, addpdt8,"5");
	objwait.waitin();
	objj.sendKeys(driver, addpdt9,"3");
	objwait.waitin();
	objj.sendKeys(driver, addpdt12,"1");
	objwait.waitin();

}


public void pdtbutton3() throws Exception {


	  objj1.clickUsingJS(driver, addpdt12);
	  objwait.waitin();
	  objj1.clickUsingJS(driver, addpdt11);
	  objwait.waitin();
}
public void pdtbutton4() throws Exception {
	  addpdt14.clear();
	  objwait.waitin();
	  objj.sendKeys(driver, addpdt14, "4");
	  objwait.waitin();
	  //objj1.clickUsingJS(driver, addpdt15);
	  addpdt15.click();
	  objwait.waitin();

}
public void pdtbutton5() throws Exception {

			
	addpdt16.click();
	  objwait.waitin();
	  addpdt16.sendKeys("Ryan");
	  objwait.waitin();
		 objj1.clickUsingJS(driver, iconbar);
		  objwait.waitin();

}
}
