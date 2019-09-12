package com.ObjectRepository;

import org.openqa.selenium.support.PageFactory;

import com.genericLib.BaseClass;
import com.genericLib.WebDriverCommonUtils;



public class LoginFB extends BaseClass 
{
		WebDriverCommonUtils wdcu = new WebDriverCommonUtils();
		FbXpath fbxp = new FbXpath();
		
		public void loginUID() throws Exception
		{
			Thread.sleep(500);
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
