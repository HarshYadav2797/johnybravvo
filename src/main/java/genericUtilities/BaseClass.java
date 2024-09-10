package genericUtilities;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sDriver;
	
		ExcelFileUtility eu = new ExcelFileUtility();
		PropertiesFileUtility pu= new PropertiesFileUtility();
		SeleniumUtility su= new SeleniumUtility();
		
		
		@BeforeSuite(alwaysRun=true)
		public void bsConfig()
		{
			System.out.println("----DB CONNECTION SUCCESSFUL----");
	    }
		
		//@BeforeClass(alwaysRun=true)
		@BeforeTest(alwaysRun=true)
		public void bcConfig() throws IOException
		
		{
			
			
			//LAUNCHING THE BROWSER
			
			String URL = pu.propertyFile("URL");
			driver= new ChromeDriver();
			
			
			driver.get(URL);
			su.maximizeWindow(driver);
			su.implicitWaits(driver);
			
			sDriver=driver;
		
		}
		
		@BeforeMethod(alwaysRun=true)
		public void bmConfig() throws IOException
		{
	     
	    
			String USERNAME = pu.propertyFile("USERNAME");
			String PASSWORD = pu.propertyFile("PASSWORD");
			LoginPage lp= new LoginPage(driver);
	        lp.login(USERNAME, PASSWORD);
	        System.out.println("----LOGIN SUCCESSFULL-----");
		}
		
		@AfterMethod(alwaysRun=true)
		public void amConfig() throws InterruptedException
		{
			HomePage hp= new HomePage(driver);
			hp.logout();
			System.out.println("----LOGOUT SUCCESSFUL-----");
		}
		
		//@AfterClass(alwaysRun=true)
		@AfterTest(alwaysRun=true)
		public void atConfig()
		{
			driver.quit();
			System.out.println("-----BROWSER CLOSED----");
		}
		
		@AfterSuite(alwaysRun=true)
		public void asConfig()
		{
			System.out.println("------DB CONNECTION CLOSED-----");
		}
	}


