package popUps;

import org.testng.annotations.Test;

import viaUsingPom.Baseclass;
import viaUsingPom.registerPage;

public class FirstNameTextBox extends Baseclass{
	@Test
	public void firstNameTextBox() {
		registerPage rp = new registerPage(driver);
		rp.getFirstNameTextBox().click();
		rp.getFirstNameTextBox().sendKeys("charan");
		

	}
}
