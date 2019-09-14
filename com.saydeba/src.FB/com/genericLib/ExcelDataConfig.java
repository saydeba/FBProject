package com.genericLib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataConfig 
{
	HSSFWorkbook wb; //if Excel file extention is .xlsx.... then XSSF
	HSSFSheet sheetNo;
	
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
		
		public String getStringData(int sheetNumber, int row, int colomn)
		{
			sheetNo = wb.getSheetAt(sheetNumber);
			String data= sheetNo.getRow(row).getCell(colomn).getStringCellValue();
			return data;
		}

		public int getIntData(int sheetNumber, int row, int colomn)
		{
			sheetNo = wb.getSheetAt(sheetNumber);
			int data= (int) sheetNo.getRow(row).getCell(colomn).getNumericCellValue();
			//int data= (int) sheetNo.getRow(row).getCell(colomn).getRowIndex();
			return data;
		}

	}


