package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToOrangHRM {
	
	static WebDriver driver;
		
	
	@Test(priority = 1)
	public void orangeHrmLogin() {
		
	
			System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
				
					
		    WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			    username.sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[ @id='btnLogin']")).click();
			
					
		}
	
	@Test(priority = 3)
	public void logout() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
