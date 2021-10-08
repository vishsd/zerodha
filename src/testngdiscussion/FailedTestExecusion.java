package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestExecusion {
	
	@Test
	public void login() {
		
         System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin12");        //here we enter the wrong pass for fail test
		driver.findElementByXPath(" //*[ @id='btnLogin']").click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	}
	
	@Test(dependsOnMethods = "login")    //skip test case also store in failed test case XML
	public void testCase2() {
		System.out.println("test case two");
	}
	@Test
	public void testCase3() {
		System.out.println("test case three");
//		Assert.fail();
	}

}
