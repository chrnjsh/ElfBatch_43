package viaUsingPom;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.By.ByLinkText;
	import org.openqa.selenium.support.FindBy;
	import org.testng.Reporter;
	import org.testng.annotations.Test;
	public class Tc_002FirstNameTextBox extends Baseclass{
		@Test
		public void firstNameTextBox() {
			registerPage rp = new registerPage(driver);
			rp.getFirstNameTextBox().click();
			rp.getFirstNameTextBox().sendKeys("charan",Keys.ENTER);
}
} 