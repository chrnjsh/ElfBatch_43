package TestNgBatchExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_bikes1 {
	@Parameters("browsername")
	@Test(groups = "smoke")
	public void DuctaiSeries(@Optional("chrome") String bname) {

		WebDriver driver = null;
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new FirefoxDriver();
		} else {
			Reporter.log("please pass valid browser name", true);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.ducati.com/in/en/home");
		driver.quit();

	}

}
