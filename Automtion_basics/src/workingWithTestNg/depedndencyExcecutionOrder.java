package workingWithTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class depedndencyExcecutionOrder {
	
	@Test(dependsOnMethods="register",invocationCount=0)
	public void createAccount(){
		Reporter.log("From Create Account",true);
	}
	@Test(dependsOnMethods={"createAccount","register"})
	public void modifyAccount() {
		Reporter.log("From Modify Account",true);
	}
	@Test
	public void register(){
		Reporter.log("From register",true);
	}
	@Test(dependsOnMethods="createAccount")
	public void amountTransfer(){
		Reporter.log("From amount transfer",true);
	}
	@Test(dependsOnMethods={"createAccount","modifyAccount"})
	public void deleteAccount(){
		Reporter.log("From delete Account",true);
		
	}
		
	}


