package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.File;
import org.apache.commons.io.FileUtils; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	
	
	/**
	 * This will Maximize the Window
	 */
	public void maximizeWindow(WebDriver driver)
	{
	     driver.manage().window().maximize();	
	}
	/**
	 * This will minimize the window
	 * @param driver
	 */
	
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	/**
	 * this method will make the screen full sized
	 * @param driver
	 */
	public void fullScreem(WebDriver driver)
	{
		driver.manage().window().fullscreen();
	}
	
	/**
	 * This method will select the option from drop-down by index value
	 * @param element
	 * @param value
	 */
	public void dropDownSelectbyIndex(WebElement element, int value)
	{
		Select sc= new Select(element);
		sc.selectByIndex(value);
	}
	
	/**
	 * This method will select the option from drop-down by value
	 * @param element
	 * @param value
	 */
	public void dropDownByValue(WebElement element, String value)
	{
		Select sc= new Select(element);
		sc.selectByValue(value);
	}
	/**
	 * This method will select the option from drop-down by visible text
	 * @param element
	 * @param visibleText
	 */
	public void dropDownByVisibleText(WebElement element, String visibleText)
	{
		Select sc= new Select(element);
		sc.selectByVisibleText(visibleText);
	}
	
	/**
	 * this method will perform mouse hovering function
	 * @param driver
	 * @param element
	 */
	
	public void mouseHovering(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
		
	}
	/**
	 * this method will do context click on webelement
	 * @param driver
	 * @param element
	 */

	public void contextClick(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		
		act.contextClick(element).perform();
	
	}

	/**
	 * this method will double click the web element
	 * @param driver
	 * @param element
	 */
	
	public void doubleClick(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		
		act.doubleClick(element).perform();
    }
	
	/**
	 * this method will perform click and hold action on web element
	 * @param driver
	 * @param element
	 */
	
	public void clickAndHold(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		
		act.clickAndHold(element).perform();;
	}
	
	/**
	 * this method will perform click and hold action on the webelement
	 * @param driver
	 * @param element
	 * @param element2
	 */
	
	public void clickAndHold(WebDriver driver, WebElement element,WebElement element2)
	{
		Actions act = new Actions(driver);
		
		act.dragAndDrop(element, element2).perform();
    }
	
	/**
	 * this method will accept alert popup
	 * @param driver
	 */
	
	public void alertPopUpAccept (WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * this method will dismiss alert popup
	 * @param driver
	 */
	
	public void alertpopUpDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void handleDropDownByxAPath(WebDriver driver, String Element)
	{
		driver.findElement(By.xpath(Element)).click();
	}
	public void implicitWaits(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public String captureScreenShot(WebDriver driver, String screenShot1) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(".\\Screenshots\\"+screenShot1+".png");
	    FileUtils.copyFile(src, dst);
	    return dst.getAbsolutePath();
	    //get absolute path() is a function from file class java.io.file
		
	}
	public void getWindowHandles(WebDriver driver, String parentWindowTitle)
	{
		
		Set<String> allID = driver.getWindowHandles();
		for (String id : allID) {
		String childwin = driver.switchTo().window(id).getTitle();
		if (!childwin.equals(parentWindowTitle)) {
			
			break;
		}
		
		}
		
	}
	
	}   
     

