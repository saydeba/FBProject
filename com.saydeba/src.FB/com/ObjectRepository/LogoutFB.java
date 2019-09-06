package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genericLib.BaseClass;

public class LogoutFB extends BaseClass
{	
	
		@FindBy(xpath= "//div[@id='logoutMenu']")
		private WebElement logoutMenu;
		
		@FindBy(xpath = "//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem']//a[@class='_54nc']")
		private WebElement logout;
		
		public void logoutMenu()
		{
			logoutMenu.click();			
		}
		public void signout()
		{
			logout.click();
		}
}
