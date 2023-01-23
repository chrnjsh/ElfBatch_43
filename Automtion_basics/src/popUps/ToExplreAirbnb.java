
package popUps;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToExplreAirbnb {
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime systemDateAndTime = LocalDateTime.now();
		int month = systemDateAndTime.getMonthValue();
		System.out.println(month);
		int day = systemDateAndTime.getDayOfMonth();
		System.out.println(day);
		int year = systemDateAndTime.getYear();
		System.out.println(year);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.airbnb.co.in/");
		WebDriverWait explicitwait =  new WebDriverWait(driver, 15);
		WebElement closeElement = driver.findElement(By.xpath("//button[@aria-label='Close']"));
		explicitwait.until(ExpectedConditions.visibilityOf(closeElement));
		closeElement.click();
		WebElement search = driver.findElement(By.xpath("//div[text()='Anywhere']"));
		explicitwait.until(ExpectedConditions.visibilityOf(search));
		driver.findElement(By.xpath("//div[@data-testid='little-search-icon']")).click();
		driver.findElement(By.xpath("//div[text()='Check in']")).click();
		driver.findElement(By.xpath("//div[@data-testid='calendar-day-"+day+"/"+month+"/"+year+"']")).click();
		
		
		
		
		
		
	}
}