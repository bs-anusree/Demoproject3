package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Login1;
import pageElements.PeopleC1;
import pageElements.PeopleW1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PeopleC extends webDriverManager{
	static WebDriver driver;
	//Login1 obj;
	PeopleC1 obj1;

  @Test(priority=15,enabled=true)
  public void peoplefn5() throws Exception {
	 
	 // obj.loginbutton2();
	  driver = webDriverManager.driver;
	  obj1=new PeopleC1(driver);
	  obj1.customersclick();
	
	  WebElement addcustomer=driver.findElement(By.xpath("/html/body/div[2]/button"));
	   Assert.assertEquals(true, addcustomer.isDisplayed());
  }
  @Test(priority=16,enabled=true)
  public void peoplefn6() throws Exception {
	
	  obj1.addcustomers();
	  String expectedtext="";
	   WebElement actualtext=driver.findElement(By.id("CustomerName"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	   System.out.println(" Assert passed");
  }
  @Test(priority=17,enabled=true)
  public void peoplefn7() throws Exception {
	
	  obj1.search();
	  WebElement search=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
	   Assert.assertEquals(true,search.isDisplayed());
  }
//  @BeforeTest
//  public void beforeTest() {
//	  launchBrowser("chrome","https://qalegend.com/restaurant/");
//	  driver = webDriverManager.driver;
//	  obj=new Login1(driver);
//	  obj1=new PeopleC1(driver);
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }

}
