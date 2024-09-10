package randomPOmClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtilities.ExcelFileUtility;
import genericUtilities.SeleniumUtility;

public class AuthenticationPop {
	@Test
	public void handlePopup() throws EncryptedDocumentException, IOException
	{
		SeleniumUtility su= new SeleniumUtility();
		ExcelFileUtility eu= new ExcelFileUtility();
		String excelSheet = eu.excelDheet("CAMPAIGN", 0, 1);
		String excelSheet2 = eu.excelDheet("CAMPAIGN", 0, 2);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.fb.com/");
		su.maximizeWindow(driver);
		WebElement el = driver.findElement(By.xpath("//input[@name='email']"));
		el.sendKeys(excelSheet);
		WebElement el2 = driver.findElement(By.xpath("//input[@name='pass']"));
		el2.sendKeys(excelSheet2);
		//WebDriver driver= new TakesScreenshot();
		
	    
	}

}

