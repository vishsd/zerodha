package testcases;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{   //in that we write test case

	
	
	@Test(priority = 1)
	public void login() {
		lp.loginToApp();
	}
	
	@Test(priority = 2 , enabled = false)
	public void logout() throws InterruptedException {
		lp.logoutToApp();
	}
	
	
}
