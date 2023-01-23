package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ASUS/Downloads/MultipleWindow%20(3).html");
		
		driver.findElement(By.xpath("//input[@Value='Open Food Sites']")).click();
		Thread.sleep(2000);
		String expectedPageTitle = "Original Italian Recipes - Giallozafferano Recipes";
		Set<String> allWindowIds = driver.getWindowHandles();
		
		
		for(String WindowId : allWindowIds) {
			driver.switchTo().window(WindowId);
			String actualPageTitle = driver.getTitle();
			if(expectedPageTitle.equals(actualPageTitle)) {
				driver.manage().window().maximize();
				break;
			}
			
		}
		
	}

}
