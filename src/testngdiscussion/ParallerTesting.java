package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallerTesting {
	
	
	
	@Parameters("browser1")
	@Test
	public void browserSelection(String browsername) {
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
		}

    }
	@Parameters("browser1")
	@Test
	public void browserSelection2(String browsername) {
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.linkedin.com/");
		}

    }
	
	@Parameters("browser2")
	@Test
	public void browserSelection3(String browsername) {
	
	 if(browsername.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	 }
	
	
	}
	
}
