package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowId {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ducati.com/");
		Thread.sleep(2000);
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		String windowHandleOfThePage = driver.getWindowHandle();
		System.out.println(windowHandleOfThePage);   
		driver.close();

	}

}
