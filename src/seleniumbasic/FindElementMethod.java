package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElementMethod { 
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
//findElement method	== use to single Web Element
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath(" //*[ @id='btnLogin']").click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		//driver.findElement(By.xpath("(//input[contains(@id,'ohrmList_chkSelectRecord_')])[4]")).click(); // click 4 no check box  ( static xpath)
		      // it gives webElement 
		
		for(int i = 1;i<=20;i++)  // here are 20 check box so i=1-20             *****
		{
				driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();       // (dynamic xpath)
		}
		
//findElements Method       == use to multiple / list of WebElement
		

//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
//		driver.findElementByXPath(" //*[ @id='btnLogin']").click();
//		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
//		
//		List<WebElement> checkbox = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
//		 // it gives list <webElement>
//		
//		for(WebElement check:checkbox)
//		{
//			check.click();
//		}
//		
//		int nosize = checkbox.size();
//		System.out.println("there are "+nosize+"check box in page");
		
// click on box on alternate pattern
		
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
//		driver.findElementByXPath(" //*[ @id='btnLogin']").click();
//		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
//		
//		
//		List<WebElement> box = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
//		
//		int no = box.size();
//		System.out.println(no);
//		int i=0;
//		
//		for(WebElement check:box)
//		{
//			if (i%2==0) {
//				check.click();
//			}
//			i++;
//		}
		
		
	
		
// logout opration
		
		
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
		
	}

}
