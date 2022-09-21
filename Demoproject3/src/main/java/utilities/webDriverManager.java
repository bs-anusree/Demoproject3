package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class webDriverManager {

 public static	WebDriver driver;
	
 public static void launchBrowser(String  browser,String url){
	
		
	if(browser.equalsIgnoreCase("chrome"))
		{
			
		
			System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();//for launching chromebrowser 
			
			driver.get(url);//for launching the url(app)on the chromebrowser
			driver.manage().window().maximize();//maximise the webpage
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		}
			else if(browser.equalsIgnoreCase("IE"))
			{
			
				System.setProperty("webdriver.edge.driver", "C:\\Selinium\\edgedriver_win64\\msedgedriver.exe");
				driver=new EdgeDriver();//for launching 
				
				driver.get(url);//for launching the url(app)
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		  
	        }
			else if(browser.equalsIgnoreCase("firefox"))
			{
			
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\jithi\\Downloads\\Geckodriver-v0.31.0-win32\\geckodriver.exe");
				driver=new FirefoxDriver();//for launching 
				
				driver.get(url);//for launching the url(app)
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		  
	        }}
	 public static void Screenshots() throws IOException {

			Date d=new Date();//current date
			SimpleDateFormat sdf= new SimpleDateFormat("ddMMyy_HHmmss");
			String timestamp=sdf.format(d);
			
			TakesScreenshot objscreen = (TakesScreenshot)driver;
			File out= objscreen.getScreenshotAs(OutputType.FILE);
			File expe = new File("C:\\Screenshot\\test"+timestamp+"jpeg");
			FileUtils.copyFile(out, expe);
			
		
			
			}
		
		//implementation of dropdown using 'By' property
		
		
		public static void dropdownfn(By element ,String value1) throws InterruptedException
		
		{
			WebElement test=driver.findElement(element);
			 Select objd= new Select(test);
			    objd.selectByValue(value1);
				//Thread.sleep(3000);
			
		}

		
		//implementation of dropdown using using webElement
		/*public static void dropdownfn(WebElement element ,String value1) throws InterruptedException
		
		{
	        Select objd= new Select(element);
			    objd.selectByValue(value1);
				Thread.sleep(3000);
		}*/
			public void draganddrop1(WebElement from,WebElement to) throws InterruptedException {
				Actions objactions=new Actions(driver);
				//Thread.sleep(3000);
				objactions.dragAndDrop(from, to).build().perform();
				
					}

			
			public void actions1(WebElement webelement) throws InterruptedException {
				Actions objactions=new Actions(driver);
				//Thread.sleep(3000);
				objactions.clickAndHold();
				//Thread.sleep(3000);
				objactions.release().build().perform();
				objactions.moveToElement(webelement).contextClick().build().perform();
				
				
				
			}
			
		public static Alert alert;
		public static String MainWindow;
		
		public static void Alertbox(String data,int i)
		{
	        
	       
			Alert objalert=driver.switchTo().alert();
			objalert.sendKeys(data);
			String s1=objalert.getText();
			System.out.println(s1);
			{
			
				if(i==0) {
					objalert.accept();
				}
				else if(i==1) {
					objalert.dismiss();
				}
			}
			
		}
		
		public void PopupMethod(String email) throws InterruptedException
		{
			 MainWindow = driver.getWindowHandle();

			Set<String> s1 = driver.getWindowHandles();
			  Iterator<String> i1 = s1.iterator();

			while (i1.hasNext()) {
				String ChildWindow = i1.next();

				if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

					driver.switchTo().window(ChildWindow);
			
							}
			}
			
			}
		public void SwitchtoParent()
		{
			driver.switchTo().window(MainWindow);

		}

		
 }
