package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		String windowHandleOfThePage = driver.getWindowHandle();
		System.out.println(windowHandleOfThePage);
		driver.quit();
		
	}

}
