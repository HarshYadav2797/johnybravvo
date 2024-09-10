package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.SeleniumUtility;

public class ContactsPage extends SeleniumUtility{
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstNametxtfld;
	
	
	@FindBy(xpath = "//div[text()='Client']")
	private WebElement type;
	
	@FindBy(xpath="//span[text()='Save']")
	private WebElement savebtn;
	
	
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//getters
	
	public WebElement getFirstNmTextField()
	{
		return firstNametxtfld;

    }
	public WebElement getType()
	{
		return type;

    }
	
	//business libraries
	
	
	public void createContacts(String TC_NAME)
	{
		firstNametxtfld.sendKeys(TC_NAME);
		savebtn.click();
		
		
	}
	
	
	
	
	
	
}