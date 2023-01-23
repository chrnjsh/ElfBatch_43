     package frames;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToOpenRedIfMailAndSendMail {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com", Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("Testing@123", Keys.ENTER);
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		WebElement enterMailPlaceHolder = driver.findElement(By.id("TO_IDcmp2"));
		enterMailPlaceHolder.sendKeys("sumanthElfBatch@rediffmail.com");
		WebElement enterSubject = driver.findElement(By.xpath("//input[@class=\"rd_inp_sub rd_subject_datacmp2\"]"));
		enterSubject.sendKeys("charan");
		WebElement frameBody = driver.findElement(By.xpath("//iframe[@title=\"Rich Text Editor, rdMailEditorcmp2\"]"));
		driver.switchTo().frame(frameBody);
		WebElement bodySub = driver.findElement(
				By.xpath("//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr cke_show_borders\"]"));
		bodySub.sendKeys("good afternoon");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class=\"send_ng_compo rd_btn_cmp_send\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[text()='Inbox']")).click();
		driver.findElement(By.xpath("//cite[@title='Refresh Inbox']"));
		driver.findElement(By.xpath("//span[@title=\"charan\"]/..//cite[@title=\"Select mail\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"rd_fil_del\"]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		 
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempScreenshot = driver.findElement(By.xpath("//div[@id=\"rdNotify\"]")).getScreenshotAs(OutputType.FILE);
		File targetScreenshot = new File("./ErrorShots/snap77.png");
		FileHandler.copy(tempScreenshot,targetScreenshot);

	}

}
