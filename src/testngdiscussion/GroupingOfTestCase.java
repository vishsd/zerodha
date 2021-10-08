package testngdiscussion;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingOfTestCase {
	
	@BeforeClass
	public void beforeBrowser() 
	{
		System.out.println("opning the Browser");
	}
	
	@Test(groups = "Sanity")
	public void navToApp() 
	{
		System.out.println("navigation to application");
	}
	
	@Test(groups = {"Sanity" , "Regration" , "Functional"} )
	public void login() 
	{
		System.out.println("login to application");
	}
	
	@Test(groups = "Regrassion")
	public void dashboard() 
	{
		System.out.println("dashboard");
	}

	@Test(groups = "Functional")
	public void profile()
	{
		System.out.println("profile");
	}

	@Test(groups = "Sanity")
	public void buy()
	{
		System.out.println("Buying of shear");
	}

	@Test(groups = "Sanity")
	public void logout() 
	{
		System.out.println("logout from application");
	}



}
