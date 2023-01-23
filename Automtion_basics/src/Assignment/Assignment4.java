package Assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.zomato.com/");
	Thread.sleep(2000);
	Point positionofTheBrowser = new Point(100,50);
	driver.manage().window().setPosition(positionofTheBrowser);
	driver.quit();	

	}

}
