package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocatewebElementWithPartilaLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("in")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("password")).click();
		
	
		
		
		

	}

}
