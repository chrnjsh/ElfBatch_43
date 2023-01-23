package testNgCars;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_cars1 {
	@Parameters("browserName")
	@Test(groups = "functionality")

	public void bmwSeries(@Optional("chrome") String bname) {
		System.out.println(bname);

		WebDriver driver = null;
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else
			Reporter.log("please pass valid browser name", true);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.dodge.com/");
		driver.quit();

	}
}