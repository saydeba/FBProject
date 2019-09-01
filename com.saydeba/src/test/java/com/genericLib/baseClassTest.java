package com.genericLib;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.ObjectRepository.commonObject;


public  class baseClassTest
{
	
		public static WebDriver wdriver;
		
	@Parameters("browser")
	@BeforeClass
		
	public void configBC(String bName)
		{
			commonObject co = new commonObject();
			System.out.println("--- Browser Calling---");
			if(bName.equals("chrome"))
			{
			co.chrome();
			}
		}
		
		
		
		
	}

