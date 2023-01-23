package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Dimension sizeOfTheBrowser = new Dimension(100,200);
		Thread.sleep(2000);
		driver.manage().window().setSize(sizeOfTheBrowser);
		driver.quit();

	}

}
