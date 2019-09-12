package com.genericLib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataConfig 
{
	HSSFWorkbook wb; //if Excel file extention is .xlsx.... then XSSF
	HSSFSheet sheet1;
	
		public ExcelDataConfig(String excelPath)
		{
			try {
				File src = new File(excelPath);
				FileInputStream fis = new FileInputStream(src);
				wb = new HSSFWorkbook(fis);
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			
		}
		
		public String getData(int sheetNumber, int row, int colomn)
		{
			sheet1 = wb.getSheetAt(sheetNumber);
			String data= sheet1.getRow(row).getCell(colomn).getStringCellValue();
			return data;
		}

		

	}


