package randomPOmClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericUtilities.ExcelFileUtility;
import genericUtilities.PropertiesFileUtility;
import genericUtilities.SeleniumUtility;
import objectRepo.ContactsPage;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class Login2Test {
	SeleniumUtility su= new SeleniumUtility();
	@Parameters("Browser")
	@Test//@Test(groups="SmokeSuite")
	public void m1() throws IOException, InterruptedException
	{
		ExcelFileUtility eu= new ExcelFileUtility();
		WebDriver driver= new ChromeDriver();
		PropertiesFileUtility pu= new PropertiesFileUtility();
		String URL = pu.propertyFile("URL");
		driver.get(URL);
		su.maximizeWindow(driver);
		su.implicitWaits(driver);
	   // WebDriver driver = null;
			Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		String USERNAME = pu.propertyFile("USERNAME");
		String PASSWORD = pu.propertyFile("PASSWORD");
		lp.login(USERNAME, PASSWORD);
		//lp.login(USERNAME, PASSWORD);
		//lp.getUsername().sendKeys(USERNAME);
		//lp.getPassword().sendKeys(PASSWORD);
		
		
		//lp.getbtn().click();
		HomePage hp= new HomePage(driver);
		hp.clickOnQuickAddBtn();
		ContactsPage cp= new ContactsPage(driver);
	
		String TC_NAME = eu.excelDheet("CAMPAIGN", 1,1);
		//String CAMPAIGN_NAME = eu.excelDheet("CAMPAIGN",1, 2);
		cp.createContacts(TC_NAME);
		
		hp.logout();
		//HomePage hp= new HomePage(driver);
		//HomePage hp= new HomePage(driver);
		/*HomePage hp=new HomePage(driver);
		hp.clickOnQuickAddBtn();
		ContactsPage cp= new ContactsPage(driver);
	
		String TC_NAME = eu.excelDheet("CAMPAIGN", 1,1);
		//String CAMPAIGN_NAME = eu.excelDheet("CAMPAIGN",1, 2);
		cp.createContacts(TC_NAME);*/
		
	
	}

}



