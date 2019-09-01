package com.saydeba;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.ObjectRepository.fbXpathTest;
import com.genericLib.baseClassTest;


public class signIn extends baseClassTest
{

	@Test
	public void emailOrPhone() throws Throwable
	{
		fbXpathTest xpath = new fbXpathTest();
		
		PageFactory.initElements(wdriver, xpath);
		xpath.emailOrPhone();
		System.out.println("Email or Phone successfully entered");
	}

}
