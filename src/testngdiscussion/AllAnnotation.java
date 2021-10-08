package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotation {

	
	@BeforeSuite
	public void openBrowser() {
		System.out.println("open the browser");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	
	@BeforeTest
	public void navToUrl() {
		System.out.println("go to the particuler url");
	}
	
	@AfterTest
	public void backToUrl() {
		System.out.println("back to the Url start point");
	}
	
	@BeforeClass
	public void loginToApp() {
		System.out.println("login to App");
	}
	
	@AfterClass
	public void logOutApp() {
		System.out.println("log out the App");
	}
	
	@BeforeMethod
	public void navToTestCasePage() {
		System.out.println("navigate to specific page where test case has perform");
	}
	
	@AfterMethod
	public void navBackToRestState() {
		System.out.println("taking back to user where it enter to write test case");
	}
	
	@Test
	public void testCase()
	{
		System.out.println("Test case execution");
	}
}
