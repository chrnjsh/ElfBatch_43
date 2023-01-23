package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWriteTestcaseForLoginProcess {

	public static void main(String[] args) throws InterruptedException {
		String expectedLoginPageTitle = "Facebook – log in or sign up";
		String expectedHomePageTitle = "";
		String usernameData = "9036789500";
		String passwordData = "@Charan789";
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser window is maximized");
		driver.get("https://www.facebook.com/");
		
		String ActualPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equals(ActualPageTitle)) {
			System.out.println("Login page is displayed");
		}
		else {
			System.out.println("Login page is not displayed");
	}
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("9036789500",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("@Charan789");
		Thread.sleep(4000);
		WebElement userNameTextField = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		userNameTextField.clear();
		userNameTextField.sendKeys(usernameData);
		String actualusernameTextField = userNameTextField.getAttribute("value");
		if(usernameData.equals(actualusernameTextField)) {
			System.out.println("succesfully entered username in username text field");
		}
		else {
			System.out.println("username is not entered properly");
		}
		
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		passwordTextField.clear();
		passwordTextField.sendKeys(passwordData);
		String actualPasswordEntered = passwordTextField.getAttribute("value");
		if(passwordData.equals(actualPasswordEntered)) {
			System.out.println("sucessfully entered password in to password text field");
		}
		else {
			System.out.println("password is not entered properly");
		}
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		String actualHomePageTitle = driver.getTitle();
		if(!expectedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("home page is displayed");
		}
		else {
			System.out.println("home page is not displayed");
		}
	}
}
				 
				 
				 
				 
				 
				 
				 