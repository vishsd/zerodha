package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.DashBoardPage;
import pages.LoginPage;

public class BaseTest {    //in that we write Driver , url related operation
	
	static WebDriver driver;
	LoginPage lp;
	DashBoardPage dbp;
	
	@BeforeSuite
	public void initBrowser() { 
		
		System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@BeforeClass
	public void objectCriation() {
		
	lp = new LoginPage(driver);
	
	dbp = new DashBoardPage(driver);	 
	}
	
	@AfterSuite
	public void tearDoen() throws InterruptedException {
		
		lp.logoutToApp();
		
		driver.quit();
		
	}

}
