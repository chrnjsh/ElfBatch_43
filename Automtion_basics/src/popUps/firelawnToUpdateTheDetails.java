package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class firelawnToUpdateTheDetails {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.firelawn.com/");
		driver.findElement(By.id("fl_login_btn")).click();
		driver.findElement(By.id("fl_email")).sendKeys("chrnjsh789@gmail.com",Keys.ENTER);
		driver.findElement(By.id("fl_password")).sendKeys("@Charan789",Keys.ENTER);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("joshi",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("chrn",Keys.ENTER);
		
	}

}
