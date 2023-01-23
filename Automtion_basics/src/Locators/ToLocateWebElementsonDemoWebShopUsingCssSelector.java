package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateWebElementsonDemoWebShopUsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class ='ico-register']")).click();
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("sri");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("charan");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("chrnjshi127@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Charan7");
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("Charan7");
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		
	}
 
}
 