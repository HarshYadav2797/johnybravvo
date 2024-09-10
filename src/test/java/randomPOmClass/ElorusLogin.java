package randomPOmClass;

import java.io.IOException;

import org.apache.poi.poifs.filesystem.DocumentOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import genericUtilities.PropertiesFileUtility;
import genericUtilities.SeleniumUtility;
import objectRepo.ContactsPage;
import objectRepo.Door;
import objectRepo.DoorPage;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class ElorusLogin {
	SeleniumUtility su= new SeleniumUtility();
	@Test
	public void m1() throws IOException, InterruptedException
	{
		ExcelFileUtility eu= new ExcelFileUtility();
		WebDriver driver= new ChromeDriver();
		PropertiesFileUtility pu= new PropertiesFileUtility();
		String URL = pu.propertyFile("URL");
		driver.get(URL);
		su.maximizeWindow(driver);
		
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
		
		
        DoorPage d= new DoorPage(driver);
        //String clientNAME = d.clientName();
        Thread.sleep(2000);
        Assert.assertTrue(d.clientName().contains(TC_NAME));
        System.out.println(TC_NAME + " Passed");
		su.captureScreenShot(driver, "tt");
		
		//hp.logout();
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
