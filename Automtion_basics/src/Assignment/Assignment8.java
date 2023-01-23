package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ASUS/Downloads/MultipleWindow.html" );
		
		
		driver.findElement(By.xpath("//input[@Value='Open Food Sites']")).click();
		Thread.sleep(2000);
		
	String expectedPageTitle = "Multiple popups";
	Set<String> allWindowsIds = driver.getWindowHandles();
	
	for(String WindowId : allWindowsIds) {
		driver.switchTo().window(WindowId);
		String actualPageTitle=driver.getTitle();
		if(!expectedPageTitle.equals(actualPageTitle)) {
			driver.manage().window().maximize();
			driver.close();
			
		}
		
	}
	
		

	}

}
