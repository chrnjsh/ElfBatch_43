package viaUsingPom;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_008EmailtextBoxErrorMsg extends Baseclass {
	@Test
	public void Tc_008emailTextBoxErrorMsg() {
		registerPage rp = new registerPage(driver);
		rp.getEmail().click();
		rp.getEmail().sendKeys("chrnjsh@.com",Keys.TAB);
		rp.getEmailErrorMsg().getText();
		Reporter.log(rp.getEmailErrorMsg().getText(),true);
	}
 
}
	