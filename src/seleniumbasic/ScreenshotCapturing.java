package seleniumbasic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.TakeScreenshotMethod;

public class ScreenshotCapturing {
	
	
	public static void main(String[] args) throws IOException {
		
         System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();    // 1-up casting 
		
		driver.manage().window().maximize();  
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
						
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		
		driver.switchTo().alert().accept();   // if popup window are open then do not able to take screen shot  so handle the pop up
		
		
		
		TakeScreenshotMethod.captureScreenshot(driver,"screenshot3");
	}
	
	
	

}
