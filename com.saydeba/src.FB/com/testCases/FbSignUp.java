package com.testCases;

import org.testng.annotations.Test;

import com.ObjectRepository.FbXpath;
import com.genericLib.BaseClass;
import com.genericLib.ExcelDataConfig;
import com.genericLib.FileUtils;


public class FbSignUp extends BaseClass
{
	FileUtils excelConfig = new FileUtils();
	ExcelDataConfig excel = new ExcelDataConfig(excelConfig.getExcel());
	
	@Test
	public void xPathClick() throws Exception
	{
		FbXpath fbxp = new FbXpath();
		fbxp.nameFirst();
	}
	
	public String getFName() throws Exception
	{
		
		System.out.println("vvvvvvvvvvvvvvvvvvvvv");
		return excel.getData(0, 1, 0);
		
	}
}