package testngdiscussion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DashBoardZerodha extends LoginToZ_Kite{
	
	@Test(priority = 2)
	public void logoutZerodha() {
		
		driver.findElement(By.xpath("//*[@class='avatar']")).click();
		driver.findElement(By.linkText("logout")).click();
		
	}

}
