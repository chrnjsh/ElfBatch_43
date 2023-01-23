package viaUsingPom;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tc_005lastNametextBox extends Baseclass {
	@Test
	public void lastNameTextBox() {
		registerPage rp = new registerPage(driver);
		rp.getLastNametextBox().click();
		rp.getLastNametextBox().sendKeys("sri",Keys.TAB);
	}

}
