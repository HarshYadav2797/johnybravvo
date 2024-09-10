package randomPOmClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import objectRepo.ContactsPage;
import objectRepo.DoorPage;
import objectRepo.HomePage;
@Listeners(genericUtilities.ListnersImplementation.class)
public class TomHardy extends BaseClass {
	ExcelFileUtility eu= new ExcelFileUtility();
	@Test(groups="SmokeSuite")
	public void madmax() throws IOException, InterruptedException
	{
		
		//Fetching Data From Excel Sheet
		String TC_NAME = eu.excelDheet("CAMPAIGN", 0, 1);
		
		//Clicking on new Button and 'Contacts' link
		HomePage hp =new HomePage(driver);
		hp.clickOnQuickAddBtn();
		
		//creating a new contact
		ContactsPage cp= new ContactsPage(driver);
		Thread.sleep(2000);
		cp.createContacts(TC_NAME);
		
		//Assert.fail();
		//validation
		DoorPage d= new DoorPage(driver);
		Thread.sleep(2000);
		Assert.assertTrue(d.clientName().contains(TC_NAME));
		System.out.println("Test Script is passed " + TC_NAME);
		
	}

}
