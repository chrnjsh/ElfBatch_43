package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureFromTextField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://affiliate.flipkart.com/login");
		WebElement textFiledEmail = driver.findElement(By.xpath("//input[@id='inputEmail']"));
		textFiledEmail.sendKeys("chrnjsh789@gmail.com",Keys.TAB);
		Thread.sleep(2000);
		WebElement textFieldPassword = driver.findElement(By.xpath("//input[@id=\"inputPassword\"]"));
		textFieldPassword.sendKeys("charan789",Keys.TAB);
		driver.findElement(By.xpath("//input[@id='submitLogin']")).click();
		Thread.sleep(3000);
		String captureText = driver.findElement(By.xpath("//div[@id='errorMsg']")).getText();
		Thread.sleep(3000);
		System.out.println(captureText);
		
		
		
	}

}
//String attrValue = textFiledEmail.getAttribute("value");

		//System.out.println(attrValue);
		   