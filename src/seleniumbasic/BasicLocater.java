package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocater {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//locator through 1>id, 2>name, 3>classname, 4>linktext, 5>partial link text 6> Xpath--contains,text(),
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
// ID	
//		WebElement username = driver.findElement(By.id("txtUsername"));
//		username.sendKeys("Admin");
////name		
//		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
////classname		 
//		WebElement loginebutten = driver.findElement(By.className("button"));
//		loginebutten.click(); 
////linktext
//		
//		WebElement forgotpsw = driver.findElement(By.linkText("Forgot your password?"));  
//		forgotpsw.click();
//partial link text	
		
//		driver.findElement(By.partialLinkText("Forgot your ")).click();  // if link text change continuously then use partial link text 
		  
//Xpath  syntax...//tagname [@attribute = 'attribute value'];
		
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
//		driver.findElementByXPath(" //*[ @id='btnLogin']").click();
//		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
////		driver.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])[4]")).click(); // click 4 no check box  ( static xpath)
//		
//		
//		for(int i = 1;i<=40;i++) { // here are 40 check box so i=1-40             *****
//			driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();       // (dynamic xpath)
//		}
		
		
//xpath--text()=== if we only have text in >< angular brasses then text() xpath use
		
		//driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		
//		driver.findElement(By.xpath("//a[contains(text(),'password?')]")).click();    // contains use to - we have few contain of given text 
		
//xpath--starts-with
		
		//driver.findElement(By.xpath( "//input[starts-with(@type,'pass')]")).sendKeys("admin123");
		
// xpath using logical operator	 --or , and
	 
	          driver.findElement(By.xpath("//input[@name='txtUsername' or @id = 'txtUser']")).sendKeys("Admin");             // one path can be true 
	          driver.findElement(By.xpath("//input[@name='txtPassword' and @id = 'txtPassword']")).sendKeys("admin123");     // both path should be true
			
		}

	}		
	
