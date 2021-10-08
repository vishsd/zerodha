package testngdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	
	@Test 
	public void loginToApp() {
		
        System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //implicit wait
		
		driver.get("https://kite.zerodha.com/");
		
		String text = driver.findElement(By.xpath("//*[@class='form-header text-center']//h2[text()='Login to Kite']")).getText();
		
		boolean ispresent = text.contains("Login");
		System.out.println(text);
		
		SoftAssert sa = new SoftAssert();     //soft assertion object
		
		sa.assertEquals(ispresent, true);   // whether this assertion fail rather remaining below code also run,- soft assert
		
	//	Assert.assertEquals(ispresent, false);  // if this are fail remainig code do not run ,- hard assert
		
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("DV1510");
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Reset@123");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("959594");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		String url = driver.getCurrentUrl();
		boolean iscorrect = url.contains("dashboard");
		System.out.println(url);
		
		sa.assertEquals(iscorrect, true);
		sa.assertAll();   //all assert result will be mark on the basis of this method (give the status)
		
	}
	
	
	

}
