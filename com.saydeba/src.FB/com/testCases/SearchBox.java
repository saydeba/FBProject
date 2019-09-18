package com.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.ObjectRepository.FbXpath;
import com.genericLib.BaseClass;
import com.genericLib.WebDriverCommonUtils;


public class SearchBox extends BaseClass
{
	WebDriverCommonUtils wdcu = new WebDriverCommonUtils();
	FbXpath fbxp = new FbXpath();
	
	@Test
	public void searchName() throws Exception 
	{
		
		
		wdcu.waitForPageToLoad();
		Thread.sleep(1000);
		PageFactory.initElements(wdriver, fbxp);
		fbxp.searchBox();
		
		Thread.sleep(500);
		
		
	}
}
