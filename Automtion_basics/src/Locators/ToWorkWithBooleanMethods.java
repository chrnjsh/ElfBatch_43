package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		Thread.sleep(2000);
		System.out.println(checkBox.isDisplayed());
		Thread.sleep(1000);
		System.out.println(checkBox.isSelected());
		checkBox.click();
		System.out.println(checkBox.isSelected());
		
		
		
		
	}

}
