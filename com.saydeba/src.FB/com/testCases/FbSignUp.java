package com.testCases;

import org.testng.annotations.Test;
import com.genericLib.BaseClass;
import com.genericLib.ExcelDataConfig;
import com.genericLib.FileUtils;


public class FbSignUp extends BaseClass
{
	FileUtils excelConfig = new FileUtils();
	ExcelDataConfig excel = new ExcelDataConfig(excelConfig.getExcel());
	
@Test
	public String getFName()
	{
		System.out.println("vvvvvvvvvvvvvvvvvvvvv");
		String nmm = excel.getData(0, 1, 0);
		return nmm;
	}
}