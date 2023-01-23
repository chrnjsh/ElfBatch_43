package viaUsingPom;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

	public class Tc_006LastNameTextBox extends Baseclass {
		@Test
		public void firstNameTextBox() {
			registerPage rp = new registerPage(driver);
			rp.getLastNametextBox().click();
			rp.getLastNametextBox().sendKeys(Keys.ENTER);
			String errormsg = rp.getLastNameErrorMsg().getText();
			Reporter.log(errormsg,true);
}
}
