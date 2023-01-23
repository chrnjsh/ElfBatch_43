package testNgCars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing {
	
//	@Parameters("Name")
	@Test
	public void mvagusta(@Optional("Name")String s) {
		System.out.println(s);
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mvagusta.com/");
		//driver.close();
	}

}
