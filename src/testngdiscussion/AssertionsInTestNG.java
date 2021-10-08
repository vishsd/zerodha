package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionsInTestNG {    
	
// Hard Assert	
	
	 @Test
	 public void loginToApp() {
	    System.setProperty("webdriver.chrome.driver" , "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		    username.sendKeys("Admin");
		driver.findElementByXPath("//*[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath(" //*[ @id='btnLogin']").click();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		boolean itpresent = url.contains("dashboard");
// assertEqual()		
		Assert.assertEquals(itpresent, true);
		
		//Assert.assertEquals(itpresent, false);  // if test is fail then exception not come here "AssertionError" are come
		
		Assert.assertEquals(true, false, "test case  fails pls cheak credential"); // if fail then msg will be display
		
	}
	 
	 @Test
	 public void logout() {
		 System.out.println("test case 2");
		 String actual = "logout";
		 
		 Assert.assertEquals(actual, "logout");
		 
		 System.out.println("After asssertion line"); // if assertion get fail then this line want be run
	 }
	 
	 @Test
	 public void testcase3() {
		 Reporter.log("test case 3", true);
		 Assert.assertTrue(true, "assert true test case get fail");  // if value come true case pass
	 }
	 
	 @Test
	 public void testcase4() {
		 Reporter.log("test case 4", true);
		 Assert.assertFalse(true, "assert false test case get fail");   // if value come false case pass	
		 Assert.assertNotEquals(42.4, 50, "valve are equals");
	 }  

}
