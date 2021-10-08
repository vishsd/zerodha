package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {  //in that we write functionalities
	
	WebDriver driver;
	
//1.declaration of variable as private
	
	@FindBy(xpath = "//input[@id='txtUsername']")      //@findBy is annotation use to find/locate the web-element
	private WebElement username; 
	
	@FindBy(xpath = "//*[@id='txtPassword']")      
	private WebElement password;
	
	@FindBy(xpath = "//*[ @id='btnLogin']")      
	private WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id='welcome']")      
	private WebElement welcomebutton;
	
	@FindBy(linkText = "Logout")      
	private WebElement logoulink;
	
	
//2. initialization using constructor	
	
	public  LoginPage(WebDriver driver) {  // Constructor create bcz we are give the driver value from the user and use in the code
		this.driver = driver;
		
		PageFactory.initElements(driver, this);           // initElements method --Initialized the value of driver. "this" is for accessing global variable
		
	}
		                                               //page factory -- is class in selenium using this we are locate and initialized the web-element
	//easy maintenances
	//Reusability of code
	//Readability get Improve & complexity get Reduced 

//3. Utilization/usages	of variable
	
	public void loginToApp() {
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbutton.click(); 
		
	}
	
	public void logoutToApp() throws InterruptedException {
	    welcomebutton.click();
		Thread.sleep(1000);
		logoulink.click();
		
		
		
	}
	
	
}
