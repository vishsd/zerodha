package seleniumbasic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownCheck {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver. get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219779%7Ce%7Cfacebook%7C&placement&creative=355887219779&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpMOIBhBAEiwAy5M6YLQb1y0gcnyiTzm7TNPMpOr9DoR6UBrsALbUP3X-25ShVwWL4mOJ0RoCEHAQAvD_BwE");
		

		
		//WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
	//day drop down	
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		
		
		for(WebElement dayvalues:days) 
		{
			 String dayoption = dayvalues.getText();
			 
			 if(dayoption.equalsIgnoreCase("11"))
			 {
				 dayvalues.click();
			 }
			 System.out.println(dayoption);
		}
	// month drop down
		
		List<WebElement> month = driver.findElements(By.xpath("//*[@id='month']//option"));
		
		for(WebElement months :month)
		{
			String monthvalue = months.getText();
			
			if(monthvalue.equalsIgnoreCase("may"))
			{
				months.click();
			}
					System.out.println(months.getText());
		}
	// year Drop down	
			List<WebElement> year = driver.findElements(By.xpath("//select[@id='year']//option"));
			
			for(WebElement years :year)
			{
				String yearvalue = years.getText();
				
				if(yearvalue.equalsIgnoreCase("2020"))
				{
					years.click();
				}
			System.out.println(years.getText());
			
		}
	
	

	}
}
