package testngdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToZ_Kite {
	
	static WebDriver driver;
	
	@Test
	public void zerodhaLogin() {
		
		
			System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
			
		    driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //implicit wait
			
			driver.get("https://kite.zerodha.com/");
			
			driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DAA677");
			
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");
			
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("992101");
			
			driver.findElement(By.xpath("//*[@type='submit']")).click();
		}

}
