package seleniumbasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();    // 1-up casting 
		
		driver.manage().window().maximize();  
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
						
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		
		driver.switchTo().alert().accept();   // if popup window are open then do not able to take screen shot  so handle the pop up
		
// Screen shot coding 
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;   // 2-down casting 
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);         // we take screenshot on file format.
		
		File destination = new File("C:\\Users\\vishal\\Desktop\\New folder (2)\\alertpopupscreenshot.png");  // to create a location of screen shot file
		
		FileHandler.copy(source, destination);   // connection between screenshot file and location of file -copy(File from, File to)==copy(source, destination) are created
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
