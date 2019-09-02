package com.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import com.ObjectRepository.commonObject;
import com.ObjectRepository.loginFB;
import com.ObjectRepository.logoutFB;


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
		
	@BeforeMethod
	public void configBM() throws Throwable
	{
		fileUtils configUtils = new fileUtils();
		loginFB lfb = new loginFB();
		
		System.out.println("=== Login ===");
		wdriver.get(configUtils.getURL()); 
		
		lfb.loginUID();
		Thread.sleep(500);
		lfb.loginPW();
		
	}
	
	@AfterMethod
	public void configAM() throws Throwable
	{
		System.out.println("=== Base class Log out ===");
		
		logoutFB lfbout = new logoutFB();
		PageFactory.initElements(wdriver, lfbout);
		lfbout.logoutMenu();
		lfbout.signout();
		Thread.sleep(2000);
		
	}
	
	@AfterClass
	public void configAC() throws Throwable
	{
		System.out.println("Close browser");
		wdriver.close();	
	}	
		
		
}

