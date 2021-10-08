package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {
	// execution is done on alphabetical order if does not give priority.
	//priority are duplicate,-ve, not require to be an sequential. it work on lowest value are run first. 
	// priority does not have decimal value 
	// if doesn't given priority then default priority is zero
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("before class ");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class ");
	}
	
	
	
	@BeforeMethod
	public void BeforeMethod()  // it execute before every @test method . it is doesn't count in test case
	{
		System.out.println("Befor mathod ");
	}
	
	@AfterMethod
	public void afterMethod() // it execute after every @test method. it is doesn't count in test case
	{
		System.out.println("after mathod ");
		
	}
	
	
	
	
	@Test(priority = -2)
	public void login() {
		System.out.println("Test case 1 from test case class");
		Reporter.log("login method massege", true);// if true print console also
		
		// Massage to be print in report by using Reporter class log method
	}
	
	@Test
	public void dashBoard() {
		System.out.println("Test case 2 from test case class");
		Reporter.log("dashBoard method massege ", true); //if false does not print console 
	}
	
	@Test(priority = 1)
	public void admin() {
		System.out.println("Test case 3 from test case class");
		Reporter.log("admin method massege ", true);
	}
	
	@Test(priority = 1)
	public void profile() {
		System.out.println("Test case 4 from test case class");
		Reporter.log("profile method massege", true);
	}
	

	
	
	
	
	
	
	
	

}
