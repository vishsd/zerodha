package testngdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallerTestClasses1 {
	
	@Test
	public void browserSelection2() {
		
		
			System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //implicit wait
			
			driver.get("https://kite.zerodha.com/");
			
			driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("TP4024");
			
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Vs#2012@");
			
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("122094");
			
			driver.findElement(By.xpath("//*[@type='submit']")).click();
		}

    }
	
	
	
		

