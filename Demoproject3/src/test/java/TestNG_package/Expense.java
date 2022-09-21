package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Categories1;
import pageElements.Expense1;
import pageElements.Login1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Expense extends webDriverManager{
	//Login1 obj;
	Expense1 obj1;
	  @Test(priority=23,enabled=true)
	  public void expense1() throws Exception{
		 
		 // obj.loginbutton1();
		  driver = webDriverManager.driver;
			 obj1=new Expense1(driver);
		 obj1.expense();

		  WebElement addexpense=driver.findElement(By.xpath("//html/body/div[2]/button"));
		   Assert.assertEquals(true, addexpense.isDisplayed());
		   System.out.println(" Assert passed");

	  }
	  @Test(priority=24,enabled=true)
	  public void expense2() throws Exception{
		 obj1.addexpense();
		 String expectedtext="";
		  WebElement actualtext=driver.findElement(By.id("Date"));
		   Assert.assertEquals(expectedtext, actualtext.getText());
		   System.out.println(" Assert passed");

	  }
	  @Test(priority=25,enabled=true)
	  public void expense3() throws Exception{
		 obj1.dropdown();
		 String expectedtext="";
		  WebElement actualtext=driver.findElement(By.name("reference"));
		   Assert.assertEquals(expectedtext, actualtext.getText());
		   System.out.println(" Assert passed");
	  }
	  @Test(priority=26,enabled=true)
	  public void expense4() throws Exception{
		 obj1.search();
		 WebElement search=driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input"));
		   Assert.assertEquals(true, search.isDisplayed());
		   System.out.println(" Assert passed");
	  }
 
  /*@BeforeTest
  public void beforeTest() {
	  launchBrowser("chrome","https://qalegend.com/restaurant/");
	  driver = webDriverManager.driver;
	  obj=new Login1(driver);
	  obj1=new Expense1(driver);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }*/
}
