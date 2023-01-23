package TestNgBatchExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_bikes3 {
	@Parameters("browsername")
	@Test(groups = "system")
	public void triumphSeries(@Optional("chrome") String bname) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = null;
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else
			Reporter.log("please pass valid browser name", true);

		driver.manage().window().maximize();
		System.out.println("charan");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.triumphmotorcycles.in/");
		driver.quit();

	}
}
