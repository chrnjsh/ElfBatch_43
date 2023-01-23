package viaUsingPom;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_001genderradioButton extends Baseclass {
	@Test
	public void femalegenderRadioButton() {
	registerPage rp = new registerPage(driver);
	String gender = ReadData.fromPropertyFile("Gender");
	if (gender.equalsIgnoreCase("female")) {
		rp.getFemalegenderRadioButton().click();
	}
	else if(gender.equalsIgnoreCase("male")) {
		rp.getMalegenderRadioButton().click();
	}
	else {
		Reporter.log("invalid gender");
	}
	driver.navigate().to(ReadData.fromPropertyFile(gender));

	}
	

}
