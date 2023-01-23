package mouseAndKeyboardsSimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveTheCursorToclickOneEements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.get("https://www.axorhelmets.com/index.php");
		WebElement helmetsNavBar = driver.findElement(By.xpath("//a[@href='https://axorhelmets.com/helmets']"));
		helmetsNavBar.click();
		Actions actions = new Actions(driver);
		//actions.moveByOffset(428,106).perform();
		//driver.findElement(By.xpath("//a[text()='RETRO HELMETS']")).click();
		
		
		actions.moveToElement(helmetsNavBar, 0, 317).click().perform();
		
		
	}


}