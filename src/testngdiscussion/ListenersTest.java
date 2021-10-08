package testngdiscussion;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ListenersTest {
	
	static WebDriver driver;
	
	@Test(priority = 1)
	public void login() {
	    System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //implicit wait
			
			driver.get("https://kite.zerodha.com/");
			
			driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("TP4024");
			
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Vs#2012@");
			
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("122094");
			
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			SoftAssert sa = new SoftAssert();     //soft assertion object
			
			String url = driver.getCurrentUrl();
			boolean iscorrect = url.contains("dashboard");
			System.out.println(url);
			
			sa.assertEquals(iscorrect, true);
			sa.assertAll();   //all assert result will be mark on the basis of this method (give the status)
			
			
			
	}
	
	@Test(dependsOnMethods = "login", priority=2)
	public void dashboard() {
		System.out.println("dashboard is executing");
	}

}
