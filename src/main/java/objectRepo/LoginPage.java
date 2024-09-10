package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	//identification
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='SIGN IN']")
	private WebElement signinBtn;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//getters
	public WebElement getUsername()
	{
		return username;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getbtn()
	{
		return signinBtn;
	}
	
	//business libraries
	public void login(String USERNAME, String PASSWORD)
	{
		username.sendKeys(USERNAME);
		password.sendKeys(PASSWORD);
		signinBtn.click();
	}

}
