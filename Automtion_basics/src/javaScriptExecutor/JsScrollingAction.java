package javaScriptExecutor;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsScrollingAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		for(;;) {
			try {
				driver.findElement(By.linkText("2022 World Cup Semi Finals (Dec 13 - 14)")).click();
				break;
			}catch(NoSuchElementException e) {
				js.executeScript("window.scrollby(0,200);");
			}
			}
		}
			
}

