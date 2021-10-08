package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindowHandling {
	
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentId = driver.getWindowHandle();    // using this method we give the single window id in string
		
		System.out.println("parent window id is :"+parentId);
		
		
// new window open
		
		WebElement win1 = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		win1.click();
//		WebElement win2 = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
//		win2.click();
		
		Set<String> allwinIds = driver.getWindowHandles();              //using this method we give the multiple window id in <set string from>
		
		int count = allwinIds.size();
		System.out.println("total no of window id is :"+count);
		 
		for(String winid:allwinIds) {
			System.out.println(winid);
			
			 
			if(!(parentId.equals(winid)))
			{
				driver.switchTo().window(winid);            //for switch window
				
				driver.findElement(By.xpath("//*[@value='Try OrangeHRM for Free']")).click();
				Thread.sleep(2000);
				
				//driver.close();      //current window are close
				
				driver.quit();      //all window are close
			}
			
			
		}
		
		
		
	}

}
