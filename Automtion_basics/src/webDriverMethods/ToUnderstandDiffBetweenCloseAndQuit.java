package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandDiffBetweenCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ASUS/Desktop/MultipleWindow%20(1).html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allWindowsIds = driver.getWindowHandles();
		System.out.println("size of set : "+allWindowsIds.size());
		for(String WindowId : allWindowsIds ) {
			System.out.println(WindowId);
			
		}
		driver.quit();
	}

}
