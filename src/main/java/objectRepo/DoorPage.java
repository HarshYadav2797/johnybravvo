package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoorPage {
	@FindBy(xpath="//h3[@class='no-top no-bottom']")
	public WebElement clientName;
	
	public DoorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//getters
	
	public WebElement getClientName()
	{
		return clientName;
	}
	//business libraries
	
	public String clientName()
	{
		return clientName.getText();
	}
	

}
