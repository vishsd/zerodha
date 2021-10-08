package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpiciteWaits {
	
	//the wait work on condition if condition reach then perform opration And move out
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
// elementToBeClickable		
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);                     //explicit wait
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']")));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
//visibilityOfElementLocater		
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hidden']")));
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
//alertIsPresent
		
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		String popuptext = driver.switchTo().alert().getText();
		
		System.out.println(popuptext);
		
		driver.switchTo().alert().accept();

//element selected state to be
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='ch']"),true));
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		
		
		
		
		
		
		
		
		
	}
	

}
