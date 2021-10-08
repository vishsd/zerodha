package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethod {

	@Test(priority=1)
	public void logins()
	{
		System.out.println("login to App");
		Assert.fail();                      //to fail the particular test case
	}
	
	@Test(priority=2,dependsOnMethods = "logins")
	public void dashBoard()
	{
		System.out.println("dashBoard ");
	}
	@Test(priority=3,dependsOnMethods = "dashBoard")
	public void profile()
	{
		System.out.println("profile ");
	}
	
	@Test(priority =4)
	public void admin() {
		System.out.println("admin");
	}
	@Test(dependsOnMethods = {"dashBoard","admin"})  // multiple dependent on test case so write like string Array format.
	public void logout () {
		System.out.println("logout");
	}
}
