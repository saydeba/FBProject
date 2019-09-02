package com.ObjectRepository;

import org.openqa.selenium.support.PageFactory;

import com.genericLib.baseClassTest;
import com.genericLib.webDriverCommonUtils;



public class loginFB extends baseClassTest 
{
		webDriverCommonUtils wdcu = new webDriverCommonUtils();
		fbXpathTest fbxp = new fbXpathTest();
		
		public void loginUID() throws Exception
		{
			wdcu.waitForPageToLoad();
			PageFactory.initElements(wdriver, fbxp);
			fbxp.emailOrPhone();
			
		}
		public void loginPW() throws Exception
		{
			wdcu.waitForPageToLoad();
			PageFactory.initElements(wdriver, fbxp);
			fbxp.pwLoginID();
		}
		
		
}
