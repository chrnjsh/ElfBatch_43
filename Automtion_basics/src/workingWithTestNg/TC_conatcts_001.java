package workingWithTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_conatcts_001 {
	@Test
	public void createContact(){
		Reporter.log("FROM CREATE CONATACT",true);
	}
	@Test
	public void modifyContact(){
		Reporter.log("FROM MODIFY CONATACT",true);
	}
	@Test
	public void deleteContact(){
		Reporter.log("FROM DELETE CONATACT",true);
	}
	@Test
	public void editContact(){
		Reporter.log("FROM EDIT CONTACT",true);
	}
	
	

	}
		
	


