package randomPOmClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException 
		
	
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Poco M6 Pro 5G']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		//driver.getWindowHandle();
		String title = driver.getTitle();
		System.out.println(title);
		
		Set<String> allWinID = driver.getWindowHandles();
		for (String WindID : allWinID) 
		{
			String titleWin = driver.switchTo().window(WindID).getTitle();
			System.out.println(titleWin);
			if (!titleWin.contains(title)) {
				break;	
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		
	}

}
