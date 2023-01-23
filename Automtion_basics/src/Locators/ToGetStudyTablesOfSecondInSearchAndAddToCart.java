package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetStudyTablesOfSecondInSearchAndAddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@id='loginclose1']")).click();
		Thread.sleep(5000);
		WebElement searchTextBox = driver.findElement(By.xpath("//img[@title='Study Table']"));
		searchTextBox.click();
		Thread.sleep(6000);   
		String costOfTheProduct = driver.findElement(By.xpath("(//strong[contains(text(),'Rs')])[2]")).getText();
		System.out.println("costOfTheProduct :"+costOfTheProduct);
		costOfTheProduct=costOfTheProduct.replace("Rs", "");
		costOfTheProduct=costOfTheProduct.replace(",", "");
		costOfTheProduct=costOfTheProduct.trim();
		
		
		int cost = Integer.parseInt(costOfTheProduct);
		if(cost>10000) {
		System.out.println("the cost of the product is too high");
	}
		else {
			driver.findElement(By.xpath("(//p[@class=\"cart-btn\"])[2]")).click();
			
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title=\"Cart\"]")).click();

		
	


	}

}
   