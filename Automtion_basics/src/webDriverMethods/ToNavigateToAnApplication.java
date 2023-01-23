package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class ToNavigateToAnApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.toyota.com/");
		// driver.get("https://www.mvaugusta.com/");
		driver.close();

	}

}
