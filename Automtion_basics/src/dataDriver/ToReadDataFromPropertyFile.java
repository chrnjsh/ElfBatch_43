package dataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genricMethods.FunctionForReadingExcel;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		File absPath = new File("./TestData/SamplPropertiesToLaunch");
		FileInputStream fis = new FileInputStream(absPath);
		
		Properties properties = new Properties();
		properties.load(fis);
		
		String key = properties.get("ChromeBrowserkey").toString();
		String value = properties.get("ChromeDriverPath").toString();
		String Url = properties.get("url").toString();
		//String Name = properties.get("Name").toString();
		
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		
		System.out.println(FunctionForReadingExcel.fromPropertyFile("url"));

		 		
		
		
		
	}

}
