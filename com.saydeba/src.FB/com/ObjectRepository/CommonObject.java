package com.ObjectRepository;

import java.util.HashMap;
import java.util.Map;

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
			//create object of MapHash class....
		//Map<String, Object> prefs = new HashMap<String, Object>();
			//set the notification setting, it will override the default settings....
		//prefs.put("profile_defaulf_content_setting_value.notifications", 2);
			//create object of ChromeOption class..... 
		ChromeOptions options = new ChromeOptions();
			// set the experimental options.....
		//options.setExperimentalOption("prefs", prefs);
			//pass options object to chromedriver.....
		options.addArguments("--disable-notifications");
		wdriver= new ChromeDriver(options);
		
		
		
	}
	
	
	
	
}

