package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndCloseBrowser {
	
		
	public static void main(String[] args) throws InterruptedException {
		
		       // setProperty ("which browser to used","path of the browser")
		System.setProperty("webdriver.chrome.driver", "F:\\Testing Automation\\selenium\\selenium setup\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();    //chrome browser open
		
		driver.manage().window().maximize();  //maximaze the window
		
		driver.get("https://www.google.com"); // google page open
		
		driver.get("https://en-gb.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C355887219779%7Ce%7Cfacebook%7C&placement&creative=355887219779&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpMOIBhBAEiwAy5M6YLQb1y0gcnyiTzm7TNPMpOr9DoR6UBrsALbUP3X-25ShVwWL4mOJ0RoCEHAQAvD_BwE");
		    // facebook page open
		
		Thread.sleep(3000);  // wait for 3 sec
		
		driver. navigate().back();  // nevigate the page back
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.get("https://github.com/SeleniumHQ/selenium");    // get method wait till the  complete loading of page
		
		driver.navigate().to("https://cscservices.mahaonline.gov.in/DashBoard/Login.aspx");  // navigate method gives don't wait to complete loadinf of page
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
	    String title = driver.getTitle();  // it gives title of page
		  System.out.println(title);
		  
	//to check the Actual title & url== expected title & url
		   
		   if (title.equalsIgnoreCase("google")) {
			   System.out.println("pass");
		    }else {
			   System.out.println("fail");
		      }
		
		    String url = driver.getCurrentUrl(); // give current url to check the we move on next page or not
		      System.out.println(url);
		      
		      if (driver.getCurrentUrl().equalsIgnoreCase("google.com")) {
		    	  System.out.println("pass");
		      }else {
				System.out.println("fail");
			}
		
		driver.navigate().refresh();  // refresh the current page
		
		driver.close(); // close page
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
