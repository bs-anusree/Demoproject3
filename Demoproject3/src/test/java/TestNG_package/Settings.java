package TestNG_package;

import org.testng.annotations.Test;

import pageElements.Login1;
import pageElements.Sales1;
import pageElements.Settings1;
import utilities.webDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Settings extends webDriverManager {
	static WebDriver driver;
	//Login1 obj;
	Settings1 obj1;
	@Test(priority=30,enabled=true)
	  public void settingsfn() throws Exception{
		
		// obj.loginbutton1();
		driver = webDriverManager.driver;
		obj1=new Settings1(driver);
		  obj1.Setting();
		  
		   WebElement settings=driver.findElement(By.xpath("//*[@id=\"setting\"]/form/div[15]/button"));
			Assert.assertEquals(true, settings.isDisplayed());
	  }

	
	/* @BeforeTest
	  public void beforeTest() {
		  launchBrowser("chrome","https://qalegend.com/restaurant/");
		  driver = webDriverManager.driver;
		  obj=new Login1(driver);
		  obj1=new Settings1(driver);
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }*/
}
