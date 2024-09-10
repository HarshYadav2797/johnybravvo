package randomPOmClass;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import genericUtilities.SeleniumUtility;

public class CilianMurphy {
	@Test
	public void m1() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com/");
		WebElement s = driver.findElement(By.xpath("//input[@name='email']"));
		String ariaRole = s.getAriaRole();
		Rectangle rect = s.getRect();
		boolean di = s.isDisplayed();
		String name = s.getAccessibleName();
		String tag = s.getTagName();
		String text = s.getText();
		Point loc = s.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		String dom = s.getDomAttribute("harh");
		String dm = s.getDomProperty("kkkkkk");
		Dimension size = s.getSize();
		int ht = size.getHeight();
		int wt = size.getWidth();
		
		System.out.println(ht);
		System.out.println(wt);
		
		System.out.println(size);
		System.out.println(dm);
		System.out.println(dom);
		System.out.println(x +"    "+y);
		System.out.println(tag + "tagname");
		System.out.println(text);
		System.out.println(ariaRole + "ariarole");
		System.out.println(rect + " rectngle");
		System.out.println(di + "isdisplayed");
		System.out.println(name + "accessiblename");
		System.out.println(loc + "location");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SRC = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(".\\Screenshots\\yo.png");
		//Files.copy(SRC, dst);
		FileUtils.copyFile(SRC, dst);
	}

}
