package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckClickActionOnDisabledButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		/*driver.get("https://demoapp.skillrary.com/");
		
		WebElement textBox = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(textBox.isEnabled());
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='charan';",textBox);*/
		
		
		/*driver.get("https://www.oracle.com/in/java/technologies/javase/javase7-archive-downloads.html");
		driver.findElement(By.partialLinkText("jdk-7u80-solaris-sparcv9.tar.Z")).click();
		WebElement disableButton = driver.findElement(By.xpath("//a[text()='Download jdk-7u80-solaris-sparcv9.tar.Z']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",disableButton);*/
		
		
		driver.get("https://www.facebook.com/signup");
		WebElement CustomRadioButton = driver.findElement(By.xpath("//input[@name=\"custom_gender\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='charan';",CustomRadioButton );
		
	}
   
}
