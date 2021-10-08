package scrollinginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	//scrolling operation do not perform in selenium
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
				
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath(" //*[ @id='btnLogin']").click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;         //do casting bcz scrolling operation do not perform in selenium
		
		// for scrolling we use java script executor command
		
//		js.executeScript("window.scrollBy(0,1000)");       // (x,y)= x-horizontal scroll, y- vertical scroll
//		
//		Thread.sleep(1000);
//		
//		js.executeScript("window.scrollBy(0,-400)");
		
// scroll up to element
		
		WebElement name = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_28']"));
		
		js.executeScript("arguments[0].scrollIntoView();",name);   //only view web element

		Thread.sleep(1000);
// 3 way to click
		
		// click element using 1.java script    also 2.click Actions class, 3.find element (web element)click
		
		js.executeScript("arguments[0].click();",name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}

	