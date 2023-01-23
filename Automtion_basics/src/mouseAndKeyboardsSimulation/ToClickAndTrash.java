package mouseAndKeyboardsSimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToClickAndTrash {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitwait = new WebDriverWait(driver ,1);

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement trash = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);

		action.dragAndDrop(image3, trash).perform();
		explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras ']")));
		action.dragAndDrop(image2, trash).perform();
		explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras 1']")));
		action.dragAndDrop(image1, trash).perform();
		explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras 2']")));
		action.dragAndDrop(image4, trash).perform();
		explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras 3']")));

		action.clickAndHold(image1).perform();
		action.moveByOffset(100, 200).perform();
		Thread.sleep(2000);   
		action.release().perform();
		WebElement gallery = driver.findElement(By.id("gallery"));
		action.dragAndDrop(image3, gallery).perform();
		action.dragAndDrop(image2, gallery).perform();
		
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		WebElement accepted = driver.findElement(By.id("Accepted Elements"));
		accepted.click();
		
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(frame2);
		WebElement textName = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.dragAndDrop(textName, drop).perform();
		System.out.println(drop.getText());

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
