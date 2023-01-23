package Assignment1;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddProductOnlyIfProductIsHavingExcpectedPrice {

	public static void main(String[] args) throws InterruptedException {
	Scanner sc = new Scanner(System.in);
	int indexOfTheProduct = sc.nextInt();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver .get("https://www.axorhelmets.com/index.php");
		Thread.sleep(4000);
		WebElement menModule = driver.findElement(By.xpath("//a[@href='https://axorhelmets.com/helmets']"));
		menModule.click();
		Thread.sleep(3000);
		WebElement fullFaceHelmet = driver.findElement(By.xpath("//a[@href='https://axorhelmets.com/helmets/full-face']"));
		fullFaceHelmet.click();
		String costOfTheProduct = driver.findElement(By.xpath("(//p[contains(text(),'Rs')])["+indexOfTheProduct+"]")).getText();
		System.out.println("costOfTheProduct :"+costOfTheProduct);
		costOfTheProduct=costOfTheProduct.replace("Rs", "");
		costOfTheProduct=costOfTheProduct.replace(".", "");
		costOfTheProduct=costOfTheProduct.replace(",", "");
		costOfTheProduct=costOfTheProduct.trim(); 
		
		int cost = Integer.parseInt(costOfTheProduct);
		if(cost>7000) {
		System.out.println("cost of the product is too high");
		}
		else {
			driver.findElement(By.xpath("(//div[contains(@class,'product-layout product-list')])["+indexOfTheProduct+"]")).click();
			String parentWindowId = driver.getWindowHandle();
			Set<String> allWindowIds = driver.getWindowHandles();
			allWindowIds.remove(parentWindowId);
			for(String WindowId :allWindowIds ) {
				driver.switchTo().window(WindowId);
			
			}
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class=\"radio\"][1]")).click();
			driver.findElement(By.xpath("//button[@id='button-cart']")).click();
			driver.findElement(By.xpath("//div[@id=\"cart\"]")).click();
			//driver.quit();
		}
	
	
	
	

}
}
