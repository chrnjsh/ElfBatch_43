package workingWithTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCasesOrder {
	@Test(priority=3)
	public void createAccount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.firelawn.com/");
		driver.quit();
		
	}
		@Test(priority=-3)
		public void modifyAccount() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("https://www.axorhelmets.com/index.php");
			driver.quit();	
		
		
		}
		@Test(priority=0)
		public void deleteAccount() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("https://www.ducati.com/in/en/home");
			driver.quit();
		
		
		
		
		
		
		

	}

}
