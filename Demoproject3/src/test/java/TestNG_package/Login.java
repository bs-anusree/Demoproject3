package TestNG_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageElements.Addpdt1;
import pageElements.Login1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Login extends webDriverManager{
 
	static WebDriver driver;
	Login1 obj;
	
	  @Test(priority=1,enabled=true,dataProvider="SearchProvider", dataProviderClass =Datapro.class)
	  public void invalidlogin(String username , String pwd) throws Exception  {
		 
			
		   obj.loginbutton1(username,pwd);
		   
		   String expectedtitle="POS Login";
		   String actualtitle=driver.getTitle();
		   Assert.assertEquals(expectedtitle,actualtitle,"Title mismatch");
		  
		
	}
	@Test(priority=2,enabled=true)//groups= {"functional"}          //TC1 //login
  public void loginfn() throws Exception { 
		   
	
		obj.loginbutton2();	
		 
		String expectedurl="https://qalegend.com/restaurant/";
		   String actualurl=driver.getCurrentUrl();
		if(actualurl.contains(expectedurl))
		{
		System.out.println("Test passed");
		}else {
		System.out.println("Test failed");
		}
	  
		Assert.assertEquals(actualurl,expectedurl);
	  
	     System.out.println("details to check print after hard assert");
  }
	
	
	
	@BeforeTest@Parameters({"Browser","Url"})
	  public void beforeTest(String browser,String url)throws InterruptedException 
	   {
		  launchBrowser(browser,url);
		  driver = webDriverManager.driver;
			obj=new Login1(driver);
		
  }
 //String browser,String url
 //browser,url
//  @AfterTest
//  public void afterTest() {
//	  
//	  driver.close();
//  }
//
}
