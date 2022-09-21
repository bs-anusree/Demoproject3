package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Login1;
import pageElements.PeopleW1;
import pageElements.Sales1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Sales extends webDriverManager{
	static WebDriver driver;
	//Login1 obj;
	Sales1 obj1;
	 @Test(priority=21,enabled=true)
	  public void salesfn() throws InterruptedException{
		 
		 // obj.loginbutton1();
		  driver = webDriverManager.driver;
		  obj1=new Sales1(driver);
		  obj1.Sales();

		  WebElement sales=driver.findElement(By.xpath("/html/body/div[2]/h3"));
		   Assert.assertEquals(true, sales.isDisplayed());
		   System.out.println(" Assert passed");
	  }
	 @Test(priority=22,enabled=true)
	  public void salessearch() throws Exception{
		 
		  obj1.Search();
		  String expectedtext="";
		  WebElement actualtext=driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input"));
		   Assert.assertEquals(expectedtext, actualtext.getText());
		   System.out.println(" Assert passed");
	  }
	 
	/* @BeforeTest
  public void beforeTest() {
	  launchBrowser("chrome","https://qalegend.com/restaurant/");
	  driver = webDriverManager.driver;
	  obj=new Login1(driver);
	  obj1=new Sales1(driver);
  }

 @AfterTest
  public void afterTest() {
	  driver.close();
  }*/

}
