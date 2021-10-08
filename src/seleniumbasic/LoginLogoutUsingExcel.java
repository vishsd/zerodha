package seleniumbasic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class LoginLogoutUsingExcel {
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
//login		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(ExcelReader.readData(0, 0));
		
    	driver.findElementByXPath("//*[@id='txtPassword']").sendKeys(ExcelReader.readData(0, 1));
    	
	    driver.findElementByXPath(" //*[ @id='btnLogin']").click();
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
//logout
	    
	    driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
