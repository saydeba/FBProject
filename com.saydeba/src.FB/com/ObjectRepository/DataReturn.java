package com.ObjectRepository;

import org.testng.annotations.Test;

import com.genericLib.BaseClass;
import com.genericLib.ExcelDataConfig;
import com.genericLib.FileUtils;


public class DataReturn extends BaseClass
{
	FileUtils excelConfig = new FileUtils();
	ExcelDataConfig excel = new ExcelDataConfig(excelConfig.getExcel());
	
	@Test
//	
	public String getFName() throws Exception
	{
//		FbXpath fbxp = new FbXpath();
//		fbxp.nameFirst();
//		System.out.println("vvvvvvvvvvvvvvvvvvvvv");
//		System.out.println("fbsignup Data name is: "+excel.getData(0, 1, 0));
		return excel.getData(0, 1, 0);
		
	}
}