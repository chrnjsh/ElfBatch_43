package popUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLogInToLicIndia {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explictWait = new WebDriverWait(driver,15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://licindia.in/");
		try {
		driver.findElement(By.linkText("Agents Portal")).click();
		}
		catch(ElementClickInterceptedException e){
			js.executeScript("window.scrollBy", 0,200);
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		
		Alert ConfirmationAlert = driver.switchTo().alert();
		System.out.println(ConfirmationAlert.getText());
		ConfirmationAlert.accept();
			
		
	Set<String> WindowId = driver.getWindowHandles();
	String parentId = driver.getWindowHandle();
	WindowId.remove(parentId);
	for(String window : WindowId) {
		driver.switchTo().window(window);
	}
	driver.findElement(By.xpath("// span[text()='Sign In']")).click();
	
	WebElement erroMsg = driver.findElement(By.xpath("//li[contains(text(),'Please enter your Agent Code or Email or Mobile')]"));
	System.out.println(erroMsg.getText());
	}
}