package actiondiscution;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClike {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement doubleclk = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleclk).perform();
		
		String dclktext = driver.switchTo().alert().getText();
		
		System.out.println(dclktext);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
//hover functionality
		
		WebElement submenubtn = driver.findElement(By.xpath("//*[@class='dropdown']"));
//		act.moveToElement(submenubtn).perform();
		WebElement link = driver.findElement(By.xpath("//*[@id='link2']"));
		
		act.moveToElement(submenubtn).moveToElement(link).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
