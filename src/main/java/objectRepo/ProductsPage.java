package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	@FindBy(xpath="(//input[@name='name'])[2]")
	private WebElement nametxtFld;
	
	@FindBy(xpath="//span[text()='Save']")
	private WebElement savebtn;
	
	
	
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getNameTxtFld()
	{
		return nametxtFld;
	}
	
	public WebElement getSavebtn()
	{
		return savebtn;
	}
	
	//business libraries
    public void createProduct(String Name)
    {
    	nametxtFld.sendKeys(Name);
    	savebtn.click();
    	
    	
    }
}
