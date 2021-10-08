package actiondiscution;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
	
	// action used to handle mouse  & keyboard navigation operations
	
	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   
		
		driver.manage().window().maximize();  
		
		driver.get("https://www.google.com"); 
		
		driver.get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219779%7Ce%7Cfacebook%7C&placement&creative=355887219779&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpMOIBhBAEiwAy5M6YLQb1y0gcnyiTzm7TNPMpOr9DoR6UBrsALbUP3X-25ShVwWL4mOJ0RoCEHAQAvD_BwE");

	     	Actions act = new Actions(driver);
		
		    driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("first name");
		
		
//1  .sendKeys(CharSequence... keys)	
		
		   //act.sendKeys(Keys.TAB).perform();   //do only single action then .perform() used
		
		    act.sendKeys(Keys.TAB).sendKeys("last name").sendKeys(Keys.TAB).sendKeys("435209347").build().perform();  // multiple action - .build().perform(); used
		    
//2	.sendKeys(WebElement target, CharSequence... keys)	
		    
		    
		   WebElement password = driver.findElement(By.xpath("//*[@id='password_step_input']"));
		   
		   act.sendKeys(password, "123456896").perform(); 
		   
		  // dropdown
		   
		   driver.findElement(By.xpath("//*[@id='day']")).sendKeys("20");
		   
		   act.sendKeys(Keys.TAB).sendKeys("Dec").sendKeys(Keys.TAB).sendKeys("1994").build().perform();

//click()
		  WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		  
		  act.click(gender).perform();
		   
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		

}
