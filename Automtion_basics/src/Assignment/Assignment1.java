package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwio7bD2ner7AhWQg0sFHRKJC1gYABAAGgJzZg&ohost=www.google.com&cid=CAESa-D275Lj0QDqdMINJ3PbF56TPgRlJ9uqOVg23mfS6tZ4rIRRXtd1WPHzi6nS_PBvLWGB7rv8M-Vqj8L-UB4xv04bJXH2TaUwy8nuMHBWy0q8nGVpXmCbvbmaG9yC-tHpT95KHkEpjH_2Da1o&sig=AOD64_3cdlLnwcpxKb1Y01sfEAvS2xIT8A&q&adurl&ved=2ahUKEwjTmqn2ner7AhXY8DgGHT1pCGwQ0Qx6BAgIEAE");
		String titleOfThePage =driver.getTitle();
		System.out.println(titleOfThePage);
		System.out.println(driver.getCurrentUrl());
		String sourcecodeofpage = driver.getPageSource();
		System.out.println(sourcecodeofpage);

		driver.quit();
	}
 
}
