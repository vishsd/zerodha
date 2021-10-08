package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfiguration {

	static WebDriver driver;
	
	//static String browser = "chrome";
	static String browser = "firefox";
	
	public static void main(String[] args) {
		
		if(browser.equals("chrome"))
		   {
            System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
	        driver = new ChromeDriver();
		  }
		
		if(browser.equals("firefox"))
		  {
		  	System.setProperty("webdriver.gecko.driver","F:\\Testing Automation\\selenium\\selenium setup\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		  }
		 
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		
		
	}
}
