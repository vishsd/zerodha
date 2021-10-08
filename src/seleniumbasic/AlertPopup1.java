package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	// note --rompt alert do not handle selenium bcz it no more use this type of pop up
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
//1 only Alert pop up with ok button.
		
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		
		String alertText = driver.switchTo().alert().getText(); // to handle alert popup use to "swicthTo().alert()" method
		
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();    // click "OK" on popup to use accept(); means accept the pop up
		
//2 Alert pop up with ok & cancel button
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		
		String confimationText = driver.switchTo().alert().getText();
		System.out.println(confimationText);
		
		driver.switchTo().alert().dismiss();  // click "cancel button to use dismiss(); mean cancel the pop up 
		
//3 choose file / upload file pop up
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //*[@name='upload']")).sendKeys("C:\\Users\\vishal\\Desktop\\ex14.png");
		
		
		
// double click button    -- it handle with action class
		
	//	WebElement doubleclick = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		
		
		
		
		
		
		
		
	}		
}
