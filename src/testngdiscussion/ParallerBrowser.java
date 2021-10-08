package testngdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallerBrowser {
	
	static WebDriver driver;
		
	@Parameters("browser")
	@Test(priority = 1)
	public void orangeHrmLogin(String browsername) throws InterruptedException {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\geckodriver.exe");
			
			 driver = new FirefoxDriver();
		}
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
				
					
		    WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			    username.sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[ @id='btnLogin']")).click();
			
					
	//logout		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
