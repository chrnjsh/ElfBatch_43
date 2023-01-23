package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheWebElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		driver.findElement(By.id("Email")).sendKeys("chrnjsh789");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("@chrnjsh7");
		Thread.sleep(2000);
		
		
	}

}
