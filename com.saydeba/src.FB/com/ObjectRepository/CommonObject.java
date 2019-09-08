package com.ObjectRepository;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.genericLib.BaseClass;
import com.genericLib.FileUtils;


public class CommonObject extends BaseClass
{
	FileUtils configUtils = new FileUtils();
	
	
	public void chrome() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", configUtils.getChromePath());
		
			//create object of ChromeOption class..... 
		ChromeOptions options = new ChromeOptions();
		
			// set the experimental options....
		options.addArguments("--disable-notifications");
		
		//pass options object to chromedriver.....
		wdriver= new ChromeDriver(options);
	}

}

