package com.genericLib;

import java.util.Properties;

public class baseClassTest
{
	public static void main(String[] args)
	{
		public static WebDriver driver;
		FileUtils lib=new FileUtils();
		
		@Before class
		public void configBCT throws Throwable{
			Properties pObj=lib.getpropertiesFileObj();
			String bName=pObj.getProperty("browesr");
			if(bName.equals("chrome")){
				System.setProperty("webdriver");
			
			}
			
			
		}

	}

}
