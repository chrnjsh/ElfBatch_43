package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidPopupsAndgetText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.id("reg_new_btn")).click();
		driver.findElement(By.id("file-upload")).sendKeys("D:\\charan docs\\pan card.jpg");
		Alert errorMsg = driver.switchTo().alert();
		System.out.println(errorMsg.getText());
		errorMsg.accept();
		driver.findElement(By.id("file-upload")).sendKeys("D://charan resume &docs//charan docs//Charan adhaar.pdf");
		
		
	}

}
