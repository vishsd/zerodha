package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	//Excel reader is a third party tool it own by Microsoft tool, so required to  APACHE-POI
	//
	
	public static String readData(int row,int colume) throws IOException {
		
		
        String path = System.getProperty("user.dir")+"//Book1.xlsx";
		
		File xls = new File(path);           //1. goto to the excel file 
		
// to read the excel file		
		
		FileInputStream fis = new FileInputStream(xls);    // 2. to load the excel file for the read.  here filenotfoundexception accrued. it from java class
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);             //3. to accessing the work book. it class from APACHE-POI file. here ioexception accrued
		
		XSSFSheet sheet1 = wb.getSheet("Testdata");            //4. goto excel sheet (Book1) by name
		
//		String value = sheet1.getRow(row).getCell(colume).getStringCellValue();     //5. to get value in (row,column) location in Book1 sheet 
//		
//		System.out.println(value);
		
		DataFormatter dF = new DataFormatter();               //6. it convert the all type of data into String type . it class from APACHE-POI file.
		
		 String formateddatavalue = dF.formatCellValue(sheet1.getRow(row).getCell(colume));    //5. it also to get value in (row,column) location in Book1 sheet 
	    //	System.out.println(formateddatavalue);
		return formateddatavalue;
				
	}

	
// for write data to the sheet	
	public static void writeData() throws IOException {
		
		String path = System.getProperty("user.dir")+"//Book1.xlsx";
		
		File xls = new File(path);                            //1. goto to the excel file for the read
		
		FileInputStream fis = new FileInputStream(xls);     // 2. to load the excel file   here filenotfoundexception accrued. it from java class
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);     //3. to accessing the work book. it class from APACHE-POI file. here ioexception accrued
		
		XSSFSheet sheet1 = wb.getSheetAt(0);          //4. goto excel sheet (Book1) by index value
		
		File fout = new File(path);                        //5. goto to the excel file for the write
		
		FileOutputStream fos = new FileOutputStream(xls);     //6. bcz of writing fileoutputstrime class object are created 
		
// write for existing	row & column
		
		sheet1.getRow(8).getCell(1).setCellValue("write opration");     // setCellValue method used to update the sheet value
		
		//wb.write(fos);                                                 // for the save to writing value
		
// for existing row and non existing column
		
		sheet1.getRow(7).createCell(2).setCellValue("vishal");
		
//for existing column and non existing row
		
		sheet1.createRow(10).createCell(2).setCellValue("shinde");
		
//for non existing column and non existing row	
		
		sheet1.createRow(11).createCell(3).setCellValue("vishal shinde");
		
		wb.write(fos);                              // for the save to writing value
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir")+"//sheet.xlsx";
		
		File xls = new File(path);
		
// to read the excel file		
		
		FileInputStream fis = new FileInputStream(xls);    // to load the excel file   here filenotfoundexception accrued
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);             // to accessing the work book. it class from APACHE-POI file. here ioexception accrued
		
		XSSFSheet sheet1 = wb.getSheet("Datasheet1");            // goto excel sheet (Book1) 
		
//		String value = sheet1.getRow(2).getCell(0).getStringCellValue();     // to get value in (2,0) location in Book1 sheet 
//		
//		System.out.println(value);
		
		int rowcount = sheet1.getLastRowNum()+1;            // get the count of row (index value +1)
		
		System.out.println("total count of roe is :"+rowcount);
		
		
		int colcount = sheet1.getRow(0).getLastCellNum();      //****** column count
		
		System.out.println("total count of column is :"+colcount);

// for getting all value in sheet 	
		
		for(int row=0; row<rowcount; row++) {
			for(int column=0; column<colcount; column++) {
				
				DataFormatter dF = new DataFormatter();               //6. it convert the all type of data into String type . it class from APACHE-POI file.
				
				 String formateddatavalue = dF.formatCellValue(sheet1.getRow(row).getCell(column));    //5. it also to get value in (row,column) location in Book1 sheet 
				 
				 System.out.println(formateddatavalue);
			  
				 
			}
		}
		
	
		
	}

}
