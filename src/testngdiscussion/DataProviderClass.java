package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

	
	@DataProvider(name = "TestData")
	public static String[][] dpTest() throws IOException {
		String path = "C:\\Users\\vishal\\Desktop\\excelsheet data\\sheet2.xlsx";
		
		File sheet = new File(path);
		
		FileInputStream fis = new FileInputStream(sheet);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		int row = sh1.getLastRowNum();     // count of row 
		System.out.println(row);
		
		int colomn = sh1.getRow(0).getLastCellNum();        // count of colomn
		System.out.println(colomn);
		
		String [][] data = new String [row][colomn];
		
		
		for(int i=1; i<=row; i++)
		{
			for(int j=0; j<colomn; j++) 
			{
				data[i-1][j]= sh1.getRow(i).getCell(j).getStringCellValue();   // to get value from sheet and put it into the string array data
			}
		}
		
		return data;
		
		}
	
	
//	public static void main(String[] args) throws IOException {
//		dpTest();
//	}
		
//		String [] a = new String[2];    //1D Array 
//		
//		a[0]="adjdl";
//		a[1]= "rfmkwdl";
//		
//		String [] [] b = new String [2][2];   //2D Array 
//		
//		b[0][0]="djfl";
//		b[0][1]="kfdnsl";
//		b[1][0]="wrfw";
//		b[1][1]="wrwrr";
//		
//		
//		int [][][] c = new int [1][1][1];       // 3D Array (l,b,h) from
//		
//		c[0][0][0] =45;

}
