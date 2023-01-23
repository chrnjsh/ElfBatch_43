package popUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webDriverMethods.ToCaptureWindowId;

public class ToHandlePopupsOfNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.firelawn.com/products_page/6");
		 String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("fl_compare")).click();
		Set<String> windowId = driver.getWindowHandles();
			for(String wids : windowId) {
				driver.switchTo().window(wids);
				System.out.println(driver.getTitle());
				if("www.flipkart.com".equals(driver.getTitle())) {
					driver.close();
					driver.quit();
				}
			}  
				
	}

}
