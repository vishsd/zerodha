package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {  // it use to access the data <from XML to test case>
	// parameter in testNG :it is a way of providing data inside Xml And read it in the test case
	//
	
	WebDriver driver;

	@Parameters("browser")         // give the parameter from XML 
	@Test
	public void browserSelection(String browsername) {
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		}
		
		else if(browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
		}
	}
	@Parameters({"environment","version"})
	@Test
	public void buildInfo(String env, String version) {
		System.out.println("the environment use in: "+env);
		System.out.println("the version use is: "+version);
		
		//driver.get("https://kite."+env+".zerodha.com/");
	}
	
	
	
	
	
}
