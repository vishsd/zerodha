package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();   
		
		driver.manage().window().maximize();  
		
		driver.get("https://www.google.com"); 
		driver.get("https://zoom.us/signup");
	//month
		 driver.findElement(By.xpath("//*[@id='select-0']")).click();
   		 Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='select-item-select-0-8']")).click();   //select one month 
		
//		List<WebElement> month = driver.findElements(By.xpath("//*[contains(@id,'select-item-select-0-')]"));
//		 int i = month.size();
//		 
//		 for(int j = 0; j<i;j++) {
//			 if(j==4) {
//			driver.findElement(By.xpath("(//*[contains(@id,'select-item-select-0-')])["+j+"]")).click();  //j=4=April  select all month on the condition
//			 }
//		 }
		
		 
	// day	 
		driver.findElement(By.xpath(" //*[@id='select-1']")).click();
	    driver.findElement(By.xpath("//*[@id='select-item-select-1-1']")).click();
		
	    
	//year
	    driver.findElement(By.xpath("//*[@id='select-2']")).click();
		
		
		
		
		
		
		
	}
	

}
