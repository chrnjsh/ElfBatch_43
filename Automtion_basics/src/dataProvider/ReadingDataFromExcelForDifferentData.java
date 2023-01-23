package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromExcelForDifferentData {
	@DataProvider(parallel=true)

	public String[] data() {
	String[]arr = {"https://www.ducati.com/in/en/home","https://www.mvagusta.com/models/brutale","https://www.bmw.in/en/index.html","https://www.citroen.in/" };
	
	
	return arr;
	}
	
	@Test(dataProvider = "data")
	public void test(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
	}
	{
		
	}

}
