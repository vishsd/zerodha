package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ParallerTestClasses2 {
	
	WebDriver driver;
		
	
	@Test(priority = 1)
	public void browserSelection2() {
		
	
			System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
				
					
		    WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			    username.sendKeys("Admin");
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[ @id='btnLogin']")).click();
			driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
					
		}

    
	
	@Test
	public void logout() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	
	
	
	
	
}
