package scrollinginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyInScrolling {
	// 3 way to write a value in the fild 1.webelement.sendkey(), 2.Actions class 3. scrolling 
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
				
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath(" //*[ @id='btnLogin']").click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();	
		
// send value using scrolling 
		
		WebElement textfild = driver.findElement(By.xpath("//*[@id='searchSystemUser_userName']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='vishal';", textfild);          //send the value in the fild .
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
