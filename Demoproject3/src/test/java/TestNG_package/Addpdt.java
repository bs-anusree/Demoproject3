package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Addpdt1;
import pageElements.Login1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Addpdt extends webDriverManager{
	static WebDriver driver;
	//Login1 obj;
		Addpdt1 obj1;
	@Test(priority=3,enabled=true)   
	//TC2      //click on pdt,swipe and click on add pdt
	  public void addpdtfn() throws Exception{   
		  
		
		//obj.loginbutton2();
		
		  driver = webDriverManager.driver;
		 
		  obj1=new Addpdt1(driver);
		
	   obj1.pdtbutton();
	   
	   String expectedtext="Supplier";
	   WebElement actualtext=driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/label[1]"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	   System.out.println(" Assert passed");
	
	}
	@Test(priority=4,enabled=true)  //TC3  //for sending values on textboxes of add pdt page using send keys
	  public void addpdt2fn() throws Exception{
		
	   obj1.pdtbutton2();
	   String expectedtext="Product type";
	   WebElement actualtext=driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/label[2]"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	   System.out.println(" Assert passed");
		
	}

	@Test(priority=5,enabled=true)  //TC4 //Dropdown on add pdt page
	
	public void addpdt1fn() throws Exception{
		  
	   obj1.pdtbutton1();
	   obj1.pdtbutton3();
	   WebElement inclusive=driver.findElement(By.name("taxmethod"));
	Assert.assertEquals(false, inclusive.isDisplayed());
}

@Test(priority=6,enabled=true)   //TC5            
	
	public void  stockfn() throws Exception {
	 obj1.pdtbutton4();
	 
	
	   WebElement  applyfilter=driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/button"));
	   Assert.assertEquals(true, applyfilter.isDisplayed());
}
@Test(priority=7,enabled=true) //TC6
public void  searchfn() throws Exception {
	 obj1.pdtbutton5();
	
	 WebElement  addpdt=driver.findElement(By.xpath("html/body/div[2]/button"));
	   Assert.assertEquals(true, addpdt.isDisplayed());                 
}
	
//@BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  obj=new Login1(driver);
//	  obj1=new Addpdt1(driver);
//	 
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }

}
