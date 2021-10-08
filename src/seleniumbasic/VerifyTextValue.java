package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextValue {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
// without insert value		
		
//		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
//		String massegetext = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
//		System.out.println(massegetext);
//		
//		if(massegetext.equalsIgnoreCase("Username cannot be empty")) {
//			System.out.println("test case is pass");
//		}else {
//			System.out.println("Test case is fail");
//		}
//		Thread.sleep(2000);
//		driver.close();
		
//insert username and empty pass fild
		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		
//		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
//		String massegetext1 = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
//		System.out.println(massegetext1);
//		
//		if(massegetext1.equalsIgnoreCase("Password cannot be empty")) {
//			System.out.println("test case is pass");
//		}else {
//			System.out.println("Test case is fail");
//		}
//		Thread.sleep(2000);
//		driver.close();
		
// only insert pass 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		String massegetext2 = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		System.out.println(massegetext2);
		
		if(massegetext2.equals("Username cannot be empty")) {
			System.out.println("test case is pass");
		}else {
			System.out.println("Test case is fail");
		}
		Thread.sleep(2000);
		driver.close();
		
		
	}
	
	
	

}
