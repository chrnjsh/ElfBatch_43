package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSizeAndPositionOfTheBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://store.google.com/category/phones");
	Thread.sleep(2000);
	Point positionOfTheBrowser =new Point(0,0 );
	driver.manage().window().setPosition(positionOfTheBrowser);
	Thread.sleep(2000);
	Dimension sizeOfTheBrowser = new Dimension(900,900);
	driver.manage().window().setSize(sizeOfTheBrowser);
	driver.quit();
	
	
	}

}
