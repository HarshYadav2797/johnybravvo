package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//identification
	@FindBy(xpath="//a[@title='Quick add']")
	private WebElement quickAddbtn;
	
	@FindBy(xpath="//a[@href='/contacts/add/']")
	private WebElement contactsImg;
	
	
	@FindBy(xpath="//div[@class='eos-col-xs display-xs-none display-sm-block']")
	private WebElement accBtn;
	
	@FindBy(xpath="//a[@href='/projects/add/']")
	private WebElement productsImg;

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBtn;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    //getters
	public WebElement getBtn()
	{
		return quickAddbtn;
	}
	
	public WebElement getContactClick()
	{
		return contactsImg;
	}
	public WebElement getaccBtn()
	{
		return accBtn;
	}
	
	//Business Libraries
	public void clickOnQuickAddBtn() throws InterruptedException
	{
		quickAddbtn.click();
		Thread.sleep(2000);
		contactsImg.click();
		
	}
	
	public void clickOnProductBtn() throws InterruptedException
	{
		quickAddbtn.click();
		Thread.sleep(2000);
		productsImg.click();
		
	}
	public void logout() throws InterruptedException
	{
		accBtn.click();
		Thread.sleep(1000);
		logoutBtn.click();
	}
	
}
