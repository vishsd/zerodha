package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filpkart_Example {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='_1ve3GO'])[5]")));
		
		driver.findElement(By.xpath("(//*[@class='_1ve3GO'])[5]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
