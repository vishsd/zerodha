package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelect {
	
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();   
		
		driver.manage().window().maximize();  
		
		driver.get("https://www.google.com"); 
		
		driver.get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219779%7Ce%7Cfacebook%7C&placement&creative=355887219779&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpMOIBhBAEiwAy5M6YLQb1y0gcnyiTzm7TNPMpOr9DoR6UBrsALbUP3X-25ShVwWL4mOJ0RoCEHAQAvD_BwE");

// Select class method to handle the drop down
		
	//day drop down  
	    WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
	    Select sel = new Select(day);
	    sel.selectByVisibleText("20");                       // 1st way--selectByVisibleText
	    
	    // to want select all value
	           List<WebElement> dayopt = sel.getOptions();                  // Qes---print the value on the basis of Select Class method then-
               int count = dayopt.size();
              for(int i =0; i<count; i++) {
  	            String dayval = dayopt.get(i).getText();               // get(5)-index 5 value show and getText()-give the Text of this index value
	             System.out.println(dayval);
	        }
	    
	    
	//month drop down  	    
	    WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
	   
	    Select sel1 = new Select(month);
	    sel1.selectByVisibleText("Jun");  // string value is same as in drop down is case sensitive
	    Thread.sleep(2000);
	    sel1.selectByValue("10");                            // 2nd way---selectByValue
	    
	         // to want select all month
	            List<WebElement> opt = sel1.getOptions();                  // Qes---print the value on the basis of Select Class method then-
	            int count1 = opt.size();
	           for(int i =0; i<count1; i++) {
	      	     String monthname = opt.get(i).getText();               // get(5)-index 5 value show and getText()-give the Text of this index value
	    	     System.out.println(monthname);
	   	      }
	    
	    
	 // year drop down
	     WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	     Select sel2 = new Select(year);
	     sel2.selectByIndex(21);                              // 3rd way---selectByIndex
	      
	    
	    

	}

}
