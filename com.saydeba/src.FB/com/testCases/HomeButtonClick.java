package com.testCases;

import org.testng.annotations.Test;
import com.ObjectRepository.FbXpath;
import com.genericLib.BaseClass;


public class HomeButtonClick extends BaseClass
{
	@Test
	public void newerIcTest() throws Exception 
	{
		FbXpath xpath = new FbXpath();
		
		Thread.sleep(500);
		xpath.clickHome();
		
	}
}
