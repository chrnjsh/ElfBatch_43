package mouseAndKeyboardsSimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToNavigatetoWoodenStreetAndFourthNavBar {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		Actions action = new Actions(driver);
		action.moveByOffset(408, 156).perform();
		driver.findElement(By.xpath("//a[text()='8 Seater Dining Sets ']")).click();
		
		String costOfTheProduct = driver.findElement(By.xpath("(//strong[contains(text(),'Rs')])[4]")).getText();
		System.out.println("costOfTheProduct :"+costOfTheProduct );
		costOfTheProduct=costOfTheProduct.replace("Rs", "");
		costOfTheProduct=costOfTheProduct.replace(",", "");
		costOfTheProduct=costOfTheProduct.trim();
		
		
		
		int cost = Integer.parseInt(costOfTheProduct);
		if(cost>60000) { 
			System.out.println("cost is too high");
		}
		else {
			driver.findElement(By.xpath("(//p[contains(text(),'Add to Cart')])[4]")).click();
			
		}
	
		driver.findElement(By.xpath("//a[@title=\"Cart\"]")).click();
		
		
	}

}
