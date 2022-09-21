package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Login1;
import pageElements.Stores1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Stores extends webDriverManager{
	static WebDriver driver;
	
	//Login1 obj;
	Stores1 obj1;
  @Test(priority=8,enabled=true) //TC7 //click on stores,swipe and click on add stores
  public void storesfn1() throws Exception {

//	obj.loginbutton2();
	  driver = webDriverManager.driver;
	  obj1=new Stores1(driver);
	  obj1.storesbutton1();
	  
		// WebElement  addstore=driver.findElement(By.xpath("/html/body/div[2]/button"));
		//   Assert.assertEquals(true, addstore.isDisplayed());  
	  }

  @Test(priority=9,enabled=true) //TC8  for sending values on textboxes of add stores page using send keys
  public void storesfn2() throws Exception {
	  
	  obj1.storesbutton2();
	   WebElement storename=driver.findElement(By.id("StoreName"));
	Assert.assertEquals(false, storename.isDisplayed());
	  }
  @Test(priority=10,enabled=true)//TC9  search
  public void storesfn3() throws Exception {
	  
	  obj1.storesbutton3();

	   WebElement storePhone=driver.findElement(By.id("StorePhone"));
	Assert.assertEquals(false, storePhone.isDisplayed());
  }
//  @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  obj=new Login1(driver);
//	  obj1=new Stores1(driver);
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//	
//  }

}
