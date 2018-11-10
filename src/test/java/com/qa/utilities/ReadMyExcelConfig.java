package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMyExcelConfig {
	
	XSSFWorkbook wb;
	

	public ReadMyExcelConfig(String excelPath){
		FileInputStream fis;
		File src ;
		try {
			src = new File(excelPath);
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	public String getData(String sheetName,int rownum, int columnNum){
		
		return wb.getSheet(sheetName).getRow(rownum).getCell(columnNum).getStringCellValue();
	}
}
