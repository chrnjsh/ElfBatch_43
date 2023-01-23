package javaScriptExecutor;

		import java.util.List;
		import java.util.concurrent.TimeUnit;
		

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class TrelloAssignment {
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				WebDriverWait explictwait = new WebDriverWait(driver,15);
				
				driver.get("https://trello.com/login");
				driver.findElement(By.id("user")).sendKeys("chrnjsh789@gmail.com",Keys.ENTER);
				explictwait.until(ExpectedConditions.elementToBeClickable((By.id("password"))));
				driver.findElement (By.id("password")).sendKeys("@Charan789");
				driver.findElement(By.xpath("//span[text()='Log in']")).click();
				driver.findElement(By.xpath("//div[text()='ELF_PrgathiTeam']")).click();
				WebElement manualMock = driver.findElement(By.xpath("//span[text()='ManualCompleted']"));
				WebElement selenium = driver.findElement(By.xpath("//span[text()='pending']"));
				WebElement manualToRelease = driver.findElement(By.xpath("(//span[text()='Add a card'])[2]"));
				Actions action = new Actions(driver);
				action.dragAndDrop(manualMock, manualToRelease).perform();
				WebElement pendingToRelease = driver.findElement(By.xpath("(//span[text()='Add a card'])[3]"));
				action.dragAndDrop(selenium, pendingToRelease).perform();
				
				
				
				
	}

}
