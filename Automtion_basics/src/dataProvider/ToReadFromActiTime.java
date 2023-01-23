package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadFromActiTime {
	
	@DataProvider

	public String[][] data()  {
		String[] [] sarr = {{"admin", "manager"},{"trainee","trainee"}};
		return sarr;
		
	}
		
	
@Test(dataProvider = "data")
public void test(String[] s) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys(s[0]);
			driver.findElement(By.name("pwd")).sendKeys(s[1]);
			driver.findElement(By.id("loginButton")).click();
			driver.quit();
			
		}
		}

