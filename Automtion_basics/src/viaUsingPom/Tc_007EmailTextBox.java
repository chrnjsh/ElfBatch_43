package viaUsingPom;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tc_007EmailTextBox extends Baseclass {
	@Test
public void emailTextBox() {
	registerPage rp = new registerPage(driver);
	rp.getEmail().click();
	rp.getEmail().sendKeys("chrnsjh564@gmail.com",Keys.TAB);
	
}
}
