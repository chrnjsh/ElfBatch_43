package Locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ducati.com/");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File targetScreenshot = new File("./ErrorShots/snap.png");
		FileHandler.copy(tempScreenshot, targetScreenshot);
		

		
	}

}
