package testngdiscussion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DashBoardOrangeHRM extends LoginToOrangHRM{
	
	@Test(priority = 2)
	public void adminCheckBox() {
          driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
 
		
		for(int i = 1;i<=20;i++)  // here are 20 check box so i=1-20             *****
		{
				driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();       // (dynamic xpath)
		}
	}

}
