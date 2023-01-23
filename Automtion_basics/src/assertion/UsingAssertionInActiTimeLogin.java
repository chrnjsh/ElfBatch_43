package assertion;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsingAssertionInActiTimeLogin {
	@Test
	public void LoginasAdmin() {
		String expectedLoginPageTitle = "actiTIME - Login";
		String userNameData="admin";
		String passwordData ="manager";
		String ExpectedHomePageTitle ="actiTIME - Enter Time-Track";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explictwait = new WebDriverWait(driver, 15);
		SoftAssert softAssert = new SoftAssert();
		
		
		
		driver.get("https://demo.actitime.com/login.do");
		softAssert.assertEquals(expectedLoginPageTitle, driver.getTitle(),"login page is not displayed");
		WebElement userName = driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys(userNameData);
		softAssert.assertEquals(userName.getAttribute("value"),userNameData ,"user name entered is incorrect");
		WebElement password = driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys(passwordData);
		softAssert.assertEquals(password.getAttribute("value"), passwordData, "password entered is incorrect");
		driver.findElement(By.id("loginButton")).click();
		explictwait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		//System.out.println(ExpectedHomePageTitle+" hello"+driver.getTitle());
		//softAssert.assertEquals(ExpectedHomePageTitle,driver.getTitle() , "home page is displayed");
		
		
		softAssert.assertEquals(ExpectedHomePageTitle, driver.getTitle(),"charan");
		softAssert.assertAll();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
