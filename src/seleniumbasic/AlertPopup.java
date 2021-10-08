package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();   // text path---//tagname[text()='<  value >'] or
		//driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Login/Register']"));
		driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("velocity.ctc@gmail.com");
		driver.findElement(By.xpath("//*[@class='btn51Btn btn51RipplePrimary btn51Primary']//*[text()='Continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='group inf11Input']//*[@id='login_password1']")).sendKeys("vs@1234#");
		driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Submit']")).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}