package com.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import com.ObjectRepository.CommonObject;
import com.ObjectRepository.LoginFB;
import com.ObjectRepository.LogoutFB;
import com.testCases.FbSignup;
import com.testCases.SearchBox;

public  class BaseClass
{
		public static WebDriver wdriver;
		
	@Parameters("browser")
	
	@BeforeClass
	public void configBC(String bName) throws Exception
		{
			CommonObject co = new CommonObject();
			System.out.println("--- Browser Calling---");
			if(bName.equals("chrome"))
			{
			co.chrome();
			}
		}
		
	@BeforeMethod
	public void configBM() throws Throwable
	{
		FileUtils configUtils = new FileUtils();
		LoginFB lfb = new LoginFB();
		FbSignup fbS = new FbSignup();
		SearchBox sb = new SearchBox();
		
		System.out.println("=== Login ===");
		wdriver.get(configUtils.getURL()); 
		
//		fbS.getSign(); //for sign up purpose
//		Thread.sleep(1000);
		
		lfb.loginUID(); //loging purpose
		Thread.sleep(500);
		lfb.loginPW();
		
//		sb.searchName();
//		Thread.sleep(1000);
		
	}
	
	@AfterMethod
	public void configAM() throws Throwable
	{
		System.out.println("=== Base class Log out ===");
		
		LogoutFB lfbout = new LogoutFB();
		PageFactory.initElements(wdriver, lfbout);
		lfbout.logoutMenu();
		lfbout.signout();
		Thread.sleep(500);
		
	}
	
	@AfterClass
	public void configAC() throws Throwable
	{
		System.out.println("Close browser");
		wdriver.close();	
	}	
		
		
}

