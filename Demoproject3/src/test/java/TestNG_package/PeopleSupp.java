package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Login1;
import pageElements.PeopleC1;
import pageElements.PeopleSupp1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PeopleSupp extends webDriverManager{
	static WebDriver driver;
	//Login1 obj;
	PeopleSupp1 obj1;
  @Test(priority=18,enabled=true)
  public void  peoplefn8() throws Exception {
	
	  //obj.loginbutton1();
	  driver = webDriverManager.driver;
	  obj1=new PeopleSupp1(driver);
	  obj1.suppliersclick();
	  
	  String expectedtext="Add Supplier";
	   WebElement actualtext=driver.findElement(By.xpath("/html/body/div[2]/button"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	   System.out.println(" Assert passed");
	  
  }
  @Test(priority=19,enabled=true)
  public void  peoplefn9() throws Exception {
	
	  obj1.addsuppliers();
	  String expectedtext="";
	  WebElement actualtext=driver.findElement(By.id("SupplierName"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	   System.out.println(" Assert passed");
  }
  @Test(priority=20,enabled=true)
  public void  peoplefn10() throws Exception {
	
	  obj1.searchsupp();
	  WebElement addcustomer=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
	   Assert.assertEquals(true, addcustomer.isDisplayed());
	  
  }
 /* @BeforeTest
  public void beforeTest() {
	  launchBrowser("chrome","https://qalegend.com/restaurant/");
	  driver = webDriverManager.driver;
	  obj=new Login1(driver);
	  obj1=new PeopleSupp1(driver);

  }

 @AfterTest
  public void afterTest() {
	  driver.close();
  }*/
  

}
