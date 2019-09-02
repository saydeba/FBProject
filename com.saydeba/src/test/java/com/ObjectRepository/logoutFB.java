package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genericLib.baseClassTest;

public class logoutFB extends baseClassTest
{	
	
		@FindBy(xpath= "//div[@id='logoutMenu']")
		private WebElement logoutMenu;
		
		@FindBy(xpath = "//span[contains(text(),'Log Out')]")
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
