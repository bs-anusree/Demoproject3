package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Categories1;

import pageElements.Login1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Categories extends webDriverManager {
	//Login1 obj;
	Categories1 obj1;
  @Test(priority=27,enabled=true)
  public void categoryfn1() throws Exception{
	  driver = webDriverManager.driver;
	  obj1=new Categories1(driver);
	  //obj.loginbutton1();
	  obj1.categories();

	  WebElement Categories=driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul[1]/li[7]/a/span[1]"));
		Assert.assertEquals(false, Categories.isDisplayed());
  }
  @Test(priority=28,enabled=true)
  public void categoryfn2() throws Exception{
	 obj1.Addcategory();
	 String expectedtext="Add Category";
	  WebElement actualtext=driver.findElement(By.xpath("/html/body/div[2]/button"));
	   Assert.assertEquals(expectedtext, actualtext.getText());
	   System.out.println(" Assert passed");
  }
  @Test(priority=29,enabled=true)
  public void categoryfn3() throws Exception{
	 obj1.search();
	 WebElement  search=driver.findElement(By.xpath("//*[@id=\"Table_filter\"]/label/input"));
	   Assert.assertEquals(true, search.isDisplayed());
  }
  
 /* @BeforeTest
  public void beforeTest() {
	  launchBrowser("chrome","https://qalegend.com/restaurant/");
	  driver = webDriverManager.driver;
	  obj=new Login1(driver);
	  obj1=new Categories1(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }*/

}
