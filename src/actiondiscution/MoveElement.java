package actiondiscution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {
	
	
	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath(" //*[ @id='btnLogin']")).click();
// havor to admin		
		
		WebElement admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(admin);
		
		WebElement management = driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
		WebElement user = driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
		
		act.moveToElement(admin).moveToElement(management).moveToElement(user).click().build().perform();
		
		
		
		
		
		
		
		
		
		
	}
	
}
