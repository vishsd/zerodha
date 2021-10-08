package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentId = driver.getWindowHandle();    // using this method we give the single window id in   string  from
		
		System.out.println("parent window id is :"+parentId);
		
		
// new window open	
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String> allwinIds = driver.getWindowHandles();              //using this method we give the multiple window id in    set< string > from
		
		
		int count = allwinIds.size();                         // find the no of window 
		System.out.println("total no of window id is :"+count);
		
		String [] a = new String[count];      // no of window id arrange in String Array
		 int i = 0;
		 
		 
		for(String winid:allwinIds) {
			
			a[i]=winid;
			System.out.println("windows id of :"+i+"--"+winid);
			i++;
		}
			 
			
				driver.switchTo().window(a[2]);            //for switch window
				
				driver.findElement(By.xpath("//*[@value='Try OrangeHRM for Free']")).click();
				Thread.sleep(2000);
				
				driver.get("http://www.google.com/");
				Thread.sleep(2000);
				
				driver.switchTo().window(a[0]);
				
				WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			    username.sendKeys("Admin");
			    driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
			    driver.findElementByXPath(" //*[ @id='btnLogin']").click();
			
				
				//driver.close();      //current window are close
				
			//	driver.quit();      //all window are close
			
			
			
		
		
		
		
		
		
		
		
	}

}
