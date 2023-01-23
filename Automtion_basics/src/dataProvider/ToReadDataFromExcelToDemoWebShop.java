 package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadDataFromExcelToDemoWebShop {
	@DataProvider(parallel=true)
	public String[][] registerUser() throws EncryptedDocumentException, IOException  {
		FileInputStream fis = new FileInputStream("./TestData/demoCredentiaals.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet infoSheet = workbook.getSheet("cred");
		int rowCount = infoSheet.getPhysicalNumberOfRows()-1;
		int colCount = infoSheet.getRow(0).getPhysicalNumberOfCells();
		
String Data[][] = new String[rowCount][colCount]; 
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++){
				Data[i][j]=infoSheet.getRow(i+1).getCell(j).toString();
			}
		}		
		return Data;
	}
	
		@Test(dataProvider ="registerUser")
		public void test(String[] credentials) {
			System.setProperty("webdriver.cgrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://demowebshop.tricentis.com/register");
			driver.findElement(By.id("gender-"+credentials[0]+"")).click();
			driver.findElement(By.id("FirstName")).sendKeys(credentials[1]);
			driver.findElement(By.id("LastName")).sendKeys(credentials[2]);
			driver.findElement(By.id("Email")).sendKeys(credentials[3]);
			driver.findElement(By.id("Password")).sendKeys(credentials[4]);	
			driver.findElement(By.id("ConfirmPassword")).sendKeys(credentials[5]);
			driver.findElement(By.id("register-button")).click();
			driver.quit();
		}

}
