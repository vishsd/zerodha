package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitInSelenium {
	
	// here we will customize -- explicit time UNIT and polling TIME & UNIT
	// so that why it is advance wait
	
	
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   
		
		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                     .withTimeout(50, TimeUnit.SECONDS)  // this strike out mean deprecated term
				                     .pollingEvery(10, TimeUnit.MICROSECONDS);//it is deprecated term -- it tell us here will be an exception accrued   
		
		// alert pop up			
		
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		String popuptext = driver.switchTo().alert().getText();
		
		System.out.println(popuptext);
		
		driver.switchTo().alert().accept();
				
	// text to be verify
				
				driver.findElement(By.xpath("//*[@id='populate-text']")).click();
				
				wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@class='target-text']"), "Selenium Webdriver"));
	
				//Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
