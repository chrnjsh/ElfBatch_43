package Locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TotakeScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ducati.com/");
		
		TakesScreenshot ts = driver.findElement(By.xpath("//img[@src=\"https://assets.ducati.com/dist/0.9.3/assets/img/ducati_id.png\"]"));
		File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File targetScreenshot = new File("./ErrorShots/snap4.png");
		FileHandler.copy(tempScreenshot, targetScreenshot);

		
		
	}

}
