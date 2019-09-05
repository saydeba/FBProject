package com.ObjectRepository;

import org.openqa.selenium.chrome.ChromeDriver;
import com.genericLib.BaseClass;
import com.genericLib.FileUtils;


public class CommonObject extends BaseClass
{
	FileUtils configUtils = new FileUtils();
	
	
	public void chrome()
	{
		System.setProperty("webdriver.chrome.driver", configUtils.getChromePath());
		wdriver= new ChromeDriver();
		wdriver.manage().window().maximize();
		
	}
	
	
	
	
}

