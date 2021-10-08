package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig_File {

	
	
	public static void main(String[]args) throws IOException {
	
//soft coded URL code		
		String path = System.getProperty("user.dir")+"//config.properties";
		
		FileInputStream fis =new FileInputStream(path);     // to read the file 
		
		Properties prop = new Properties();       // it is a java class 
		
		prop.load(fis);                     // to load the inputStream file
		
		 String pwd = prop.getProperty("password");       // to read the file and give string value
		 
		 System.out.println(pwd);
		
		
	}
}
