package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase2 {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	
	
	@BeforeTest
	public void BeforeTest()  // in xml format - run before the test method 
	{
		System.out.println("before test");
	}
	@AfterTest
	public void afterTest()  // in xml format - run after the test method 
	{
		System.out.println("after test");
	}
	
				
	@Test(priority = 1)
	public void login_2() {
		System.out.println("login 2 from test case class 2");
		Reporter.log("login method from test case class 2", true);// if true print console also
		
		// Massage to be print in report by using Reporter class log method
	}
	
	@Test(priority = 2)
	public void dashBoard_2() {
		System.out.println("dashBoard_2 from test case class 2");
		Reporter.log("dashBoard method from test case class 2 ", true); //if false does not print console 
	}

}
