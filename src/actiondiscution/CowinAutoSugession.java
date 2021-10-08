package actiondiscution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CowinAutoSugession {
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		search.sendKeys("cowin");
		Thread.sleep(1000);
		
		
		List<WebElement> searchlist = driver.findElements(By.xpath("//*[@class='UUbT9']//li"));
		
		for(WebElement cowsrch:searchlist) 
		{
			String cowtext = cowsrch.getText();
			
			System.out.println(cowtext);
			
			if(cowtext.contains("cowin login")) {
				cowsrch.click();
			}
		}
		
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
