package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderDropdown {
	
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath(" //*[ @id='btnLogin']").click();
		driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']")).click();	
		driver.findElement(By.xpath("//*[@id='candidateSearch_fromDate']")).click();
		 
		WebElement year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//*[@class='ui-datepicker-year']"));
		Select sel = new Select(year);
		sel.selectByValue("2020");
		
		WebElement month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//*[@class='ui-datepicker-month']"));
		Select sel1 = new Select(month);
		sel1.selectByIndex(5);
		
	}

}
