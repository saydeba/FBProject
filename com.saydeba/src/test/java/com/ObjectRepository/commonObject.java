package com.ObjectRepository;

import org.openqa.selenium.chrome.ChromeDriver;
import com.genericLib.baseClassTest;
import com.genericLib.fileUtils;


public class commonObject extends baseClassTest
{
	fileUtils configUtils = new fileUtils();
	
	
	public void chrome()
	{
		System.setProperty("webdriver.chrome.driver", configUtils.getChromePath());
		wdriver= new ChromeDriver();
		
	}
	
	
	
	
}

