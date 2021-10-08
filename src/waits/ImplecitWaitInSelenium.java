package waits;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ImplecitWaitInSelenium {

	// it a wait to run until the found of element. if element found then execute the condition if not then found till the wait value
	// it also called globle wait
	
	//polling interval or polling time :- the time interval which check the element available in page or not 
	//polling time is 0.5 sec
	
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();   
			
			driver.manage().window().maximize();
			try {
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);  // to check the time load of URL 
				// if this url dont load in 15 sec then exception accrued -- timeoutexception
			}
			catch (Exception e) {
				// give the super class of exception
			}
			
			driver.get("https://www.google.com/");
			
				
//2.Implicit wait 			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);   // dynamic wait---implicit wait
					
			WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
			search.sendKeys("india");         // after that enter using Action class 
			
			Actions act = new Actions(driver);
			//act.sendKeys(Keys.ENTER).perform();
			act.sendKeys(search, Keys.RETURN).perform();    // ENTER==RETERN   Are same
			
//			Thread.sleep(9000);                             // this is static wait - it wait full of time, where element are found or not
			
			driver.findElement(By.xpath("//*[text()='State Bank of India']")).click();
			
		driver.close();
		
		
		
	}
}
