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

public class ToEneterCerdentialsFromExcelActitime {
	@DataProvider(parallel=true)
	public String[][] loginData() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./TestData/ActitimeData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet infosheet = workbook.getSheet("login");
		int rowCount = infosheet.getPhysicalNumberOfRows()-1;
		int colCount = infosheet.getRow(0).getPhysicalNumberOfCells();
		
		
	String Data[][] = new String[rowCount][colCount]; 
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<colCount;j++){
				Data[i][j]=infosheet.getRow(i+1).getCell(j).toString();
			}
		}
				
		return Data;
	}
	
	@Test(dataProvider = "loginData")
	public void test(String []cerdentials) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(cerdentials[0]);
		driver.findElement(By.name("pwd")).sendKeys(cerdentials[1]);
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
		
		
		
		
	}

}
