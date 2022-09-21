package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Login1;
import pageElements.Logout1;
import pageElements.Sales1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Logout extends webDriverManager{
	static WebDriver driver;
	//Login1 obj;
	Logout1 obj1;
	
  @Test
  public void logout() throws Exception {
	  driver = webDriverManager.driver;
	//  obj=new Login1(driver);
	  obj1=new Logout1(driver);
	//  obj.loginbutton2();
	  obj1.logoutfn();
	  
  }
  /*@BeforeTest
  public void beforeTest() {
	  launchBrowser("chrome","https://qalegend.com/restaurant/");
	  driver = webDriverManager.driver;
	  obj=new Login1(driver);
	  obj1=new Logout1(driver);
  }*/

 @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
