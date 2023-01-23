package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toOpenMapsByIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(3000);
		WebElement mapsstore = driver.findElement(By.xpath("//iframe[@name=\"app\"]"));
		Thread.sleep(2000);
		driver.switchTo().frame(mapsstore);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
	}

}
