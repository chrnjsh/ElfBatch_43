package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCpatureSourceCodeOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.samsung.com/");
		String sourcecodeofPage = driver.getPageSource();
		System.out.println(sourcecodeofPage);

	}

}
