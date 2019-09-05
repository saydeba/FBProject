package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genericLib.BaseClass;

public class LogoutFB extends BaseClass
{	
	
		@FindBy(xpath= "//div[@id='logoutMenu']")
		private WebElement logoutMenu;
		
		@FindBy(xpath = "//form[@id='u_5_3']")
		private WebElement signout;
		
		public void logoutMenu()
		{
			logoutMenu.click();			
		}
		public void signout()
		{
			signout.click();
		}
}
