package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateWebElementsRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("sri");
		driver.findElement(By.id("LastName")).sendKeys("charan");
		driver.findElement(By.id("Email")).sendKeys("chrnjshy 789@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("@charan7");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("@charan7");
		driver.findElement(By.id("register-button")).click();
		
	}

}
