package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheContentAndReenter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Users&parent=Settings&view=Login&error=login");
		
		Thread.sleep(2000);
		WebElement userNameTextField = driver.findElement(By.xpath("//input[@id='username']"));
		userNameTextField.clear();
		userNameTextField.sendKeys("charan",Keys.TAB);
		Thread.sleep(1000);
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@id='password']"));
		passwordTextField.clear();
		Thread.sleep(1000);
		passwordTextField.sendKeys("Chrnjsh@789",Keys.TAB);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//a[text()='forgot password?']")).click();
		

	}

}
