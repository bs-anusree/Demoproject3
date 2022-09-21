package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Login1;
import pageElements.PeopleW1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PeopleW extends webDriverManager {
	static WebDriver driver;
	//Login1 obj;
	PeopleW1 obj1;
	
  @Test(priority=11,enabled=true)
  public void peoplefn1() throws Exception{
	
	// obj.loginbutton2();
	  driver = webDriverManager.driver;
	  obj1=new PeopleW1(driver);
	  obj1.peoplewaiters();
	 
	  String expectedtext="Add Waiter";
	   WebElement actualtext=driver.findElement(By.xpath("/html/body/div[2]/button"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	   System.out.println(" Assert passed");
	  

  }
  @Test(priority=12,enabled=true)
	  public void peoplefn2() throws Exception {
	  obj1.addwaiters();
	  String expectedtext="";
	   WebElement actualtext=driver.findElement(By.id("WaiterName"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	   System.out.println(" Assert passed");
	  
	  }
  @Test(priority=13,enabled=true)
  public void peoplefn3() throws Exception {
	  obj1.waitersstore();
	  WebElement  waiterphone=driver.findElement(By.id("WaiterPhone"));
	   Assert.assertEquals(false, waiterphone.isDisplayed()); 
  }
  @Test(priority=14,enabled=true)
  public void peoplefn4() throws Exception {
	  obj1.waitersearch();
	  WebElement  search=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
	   Assert.assertEquals(true, search.isDisplayed()); 
  }
  
 
//  @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  obj=new Login1(driver);
//	  obj1=new PeopleW1(driver);
//  }
//
// @AfterTest
//  public void afterTest() {
//	  driver.close();
//		
//  }

}
