package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallerTesting2 {
	@Parameters("browser2")
	@Test
	public void browserSelection4(String browsername) {
	
	 if(browsername.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.whatsapp.com/");
	 }
	
	
	}

}
