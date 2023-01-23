package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheSizeAndWidth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		WebElement emailTextField = driver.findElement(By.xpath("//input[@id=\"email\"]/.."));
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@id='pass']/../.."));
		
		Point emailTextFieldLocation = emailTextField.getLocation();
		Point passwordTextFieldLocation = passwordTextField.getLocation();
		Dimension emailTextFieldSize = emailTextField.getSize();
		Dimension passwordTextFieldsize = passwordTextField.getSize();
		
		
	
		int xLocationEmailTextField = emailTextFieldLocation.getX();
		int XLocationPasswordtextField = passwordTextFieldLocation.getX();//+height u should do
		int yLocationEmailTextField = emailTextFieldLocation.getY();
		int yLocationPasswordTextField = passwordTextFieldLocation.getY();
		int xLocationEmailTextFieldpluswidth = emailTextFieldSize.getWidth()+xLocationEmailTextField;
		int xLocationpasswordTextFieldpluswidth = passwordTextFieldsize.getWidth()+XLocationPasswordtextField;
		int yLocationEmailTextFieldplusheigth = emailTextFieldSize.getHeight()+yLocationEmailTextField;
		int yLocationpasswordTextFieldpluheigth = passwordTextFieldsize.getHeight()+yLocationPasswordTextField;

		
		/*System.out.println("x email loctaion "+ xLocationEmailTextField);
		System.out.println("x password location "+ XLocationPasswordtextField);
		System.out.println("email size "+ emailTextFieldSize.getWidth());
		System.out.println("password size "+ passwordTextFieldsize.getWidth());
		System.out.println("y email loctaion "+ yLocationEmailTextField);
		System.out.println("y password loctaion "+ yLocationPasswordTextField);
			if(xLocationEmailTextField==XLocationPasswordtextField) 
			System.out.println("it is properly alligned to left side");
			else
				System.out.println("it is not properly alligned to left side");
		
		if(xLocationEmailTextFieldpluswidth==xLocationpasswordTextFieldpluswidth)
			System.out.println("it is properly alligned to right side");
		else
			System.out.println("it is not properly assigned");*/
		
		
		System.out.println("y email loctaion "+ yLocationEmailTextField);
		System.out.println("y password loctaion "+ yLocationPasswordTextField);
		System.out.println(yLocationEmailTextFieldplusheigth);
		System.out.println(yLocationpasswordTextFieldpluheigth);
				
		if(yLocationEmailTextField==yLocationPasswordTextField)
			System.out.println("it is alligned");
		else
			System.out.println("it is not alligned");
		if(yLocationEmailTextFieldplusheigth==yLocationpasswordTextFieldpluheigth)
			System.out.println("height is alligned");
		else
			System.out.println("heigth not alligned");
		
		
			}
	
	
		}
		
  

