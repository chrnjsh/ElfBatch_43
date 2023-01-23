package assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingAssertionAndCheckingErrorMessages {
	@Test
	public void LoginnngIntoFl() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Reporter.log("web page is maximized",true);
		WebDriverWait explictDriverWait = new WebDriverWait(driver, 15);
		SoftAssert sa = new SoftAssert();
		
		
		driver.get("https://www.firelawn.com/user-signin");
		sa.assertEquals(driver.getTitle(), "Firelawn|Login","loin page is not displayed");
		
		
		WebElement emailTextBox = driver.findElement(By.id("fl_email"));
		emailTextBox.sendKeys("chrnjsh8",Keys.ENTER);
		
		
		
		
		
		
		
		
		
	}

}
