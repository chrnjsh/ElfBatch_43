package javaScriptExecutor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToDoSelectMethodsAction {

	private static WebElement daydropdown;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");

		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		
		Select daySelect = new Select(dayDropdown);
		System.out.println(daySelect.isMultiple());
		List<WebElement> dayDropdownoption = daySelect.getOptions();
		for(WebElement element :dayDropdownoption) {
		System.out.println(element.getText());
		}
		daySelect.selectByVisibleText("9");
		Select monthsSelect = new Select(monthdropdown);
		monthsSelect.selectByIndex(6);
		List<WebElement> monthSelectoptions = monthsSelect.getOptions();
		for(WebElement elemen : monthSelectoptions ) {
			System.out.println(elemen.getText());
		}
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByValue("1999");
		List<WebElement> yearSelectOption = yearSelect.getOptions();
		for( WebElement elem : yearSelectOption) {
			System.out.println(elem.getText());
		}
	
		
		
		
		
		
	}

}
