package viaUsingPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Baseclass {
	public WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void launchingDemoWebShop(@Optional("chrome") String bname) throws InterruptedException {
		if(bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Empty chrome browser is launched");
		
		}else if(bname.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
			Reporter.log("Empty edge browser is launched");
		}
		else {
			throw new InvalidBrowserValueException();
		}
			
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to(ReadData.fromPropertyFile("url").toString());
		String expectedTitle = driver.getTitle();
		Thread.sleep(3000);
		Assert.assertEquals(ReadData.fromPropertyFile("actualTitle"),expectedTitle,"welcome Page Is not Displayed");

		WelcomePage wp = new WelcomePage(driver);
		wp.getRegsiterLink().click();
		String actualRegisterPageTitle = driver.getTitle();
		Assert.assertEquals(ReadData.fromPropertyFile("actualRegisterPageTitle"),actualRegisterPageTitle,"Register Page Is not Displayed");

		}
	
}
class InvalidBrowserValueException extends RuntimeException {
	InvalidBrowserValueException(){
		super("Invalid broswer value is passed");
	}
}
