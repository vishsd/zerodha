package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IspresentMethod {
	
	// Ispresent is a method to tells us operation are Performed or Not on the given functionality. an o/p in boolean condition
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//1. isSelected method 	
		
//	        	driver.get("https://opensource-demo.orangehrmlive.com/");
//							
//				WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//				    username.sendKeys("Admin");
//				driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
//				driver.findElement(By.xpath(" //*[ @id='btnLogin']")).click();
//				driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
//				
//			WebElement checkbox = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_18']"));
//				
//		boolean ischeck = checkbox.isSelected();
//		        System.out.println("Befor click on check box :"+ischeck);
//		        
//		   checkbox.click();
//		        
//	    boolean ischeck1 = checkbox.isSelected();
//		        System.out.println("After click on check box :"+ischeck1);
		
		
//isEnable 		
		     driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		     
		   WebElement disablebtn = driver.findElement(By.xpath("//*[@id='disable']"));
		   
		   boolean isenable = disablebtn.isEnabled();
		   System.out.println("Befor opration ;"+isenable);
		   
		   driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		   
		   Thread.sleep(12000);
		   
		   boolean afteropr = disablebtn.isEnabled();
		   System.out.println("After opration :"+afteropr);
		
		
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
