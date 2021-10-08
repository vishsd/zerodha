package actiondiscution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldAndMove {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
//slider
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(slider).moveByOffset(500, 0).build().perform();
		
		Thread.sleep(2000);
		
		act.clickAndHold(slider).moveByOffset(-200, 0).build().perform();
		
		driver.switchTo().parentFrame();

//date picker 
		
		WebElement datepicker = driver.findElement(By.xpath("//*[text()='Datepicker']"));
	
	    datepicker.click();
		
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		
		while(true) {
		
		 String monthyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		
			System.out.println(monthyear);
		
	    	if(!(monthyear.equals("December 2020"))) 
	    	{
			
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		    }
	    	else 
	    	{
			     break;
		    }
		
		}
		
		int date = 20;
		driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()="+date+"]")).click();
		
		
		
		
		
		
		
		
		
		
		
	}


}
