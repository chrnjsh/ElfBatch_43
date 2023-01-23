package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ASUS/Downloads/MultipleWindow.html");
		
		driver.findElement(By.xpath("//input[@Value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allWindowsIds = driver.getWindowHandles();
		
		for(String windowId :allWindowsIds ) {
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			}
		
			
			
		

	}

}
