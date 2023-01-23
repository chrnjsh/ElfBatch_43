package popUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePopUpsByAutoIt {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.id("reg_new_btn")).click();
		driver.findElement(By.id("qq-template")).click();

		Runtime.getRuntime().exec("./AutoIt/freshWorld1.exe");
		

	}

}
