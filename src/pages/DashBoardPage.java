 package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;





public class DashBoardPage {
	
	WebDriver driver;

	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")      //@findBy is annotation use to find/locate the web-element
	private WebElement admintab; 
	
	@FindBy(xpath = "//*[contains(@id,'ohrmList_chkSelectRecord_')]")      //@findBy is annotation use to find/locate the web-element
	private List<WebElement> checkbox;
	
		
	public DashBoardPage (WebDriver driver) 
	{
        this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void navToAdmin()
	{
		admintab.click();
		for(WebElement box:checkbox) {
			box.click();
		}
		
	}

	
}
