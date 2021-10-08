package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotMethod {

	
	public static void captureScreenshot (WebDriver driver,String filename) throws IOException {
		            // here we are give arg bcz we want to give tha name for every screen shot 
		
		
        TakesScreenshot scrshot = (TakesScreenshot)driver;   // 2-down casting 
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);         // we take screenshot on file format.
// Normal 
		
	//	File destination = new File("C:\Users\vishal\Desktop\New folder (2)\\"+filename+".png");  
		                                                 // to create a location of screen shot file in desktop-new folder
// Advance
		
	//	File destination = new File("E:\\eclips workspace\\seleniumdiscution\\ScreenShot\\"+filename+".png");  // to create a location of screen shot file in selenium-screenshot folder.
		// its path valide only on the same system 
		
// Advance PRO
		
//1 way	-	
//		String srchandle = System.getProperty("user.dir")+"\\ScreenShot\\"+filename+".png"; 
		                             // user.dir -- gives the project path to store scrshot file and handle on other system also
//		File destination = new File(srchandle);

		
//2 way-
		
		File destination = new File(System.getProperty("user.dir")+"\\ScreenShot\\"+filename+".png");
		
		
		FileHandler.copy(source, destination);   // connection between screenshot file and location of file -copy(File from, File to)==copy(source, destination) are created
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
