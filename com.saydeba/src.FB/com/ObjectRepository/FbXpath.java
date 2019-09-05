package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.genericLib.BaseClass;
import com.genericLib.FileUtils;

public class FbXpath extends BaseClass
{
	FileUtils fu = new FileUtils();
	
	//data member field...
	@FindBy(name="email")  //email enter....
	WebElement emailEtdBox;
	
	@FindBy(name ="pass")  //password enter
	WebElement pwEnterEdtBox;
	
	@FindBy(xpath="//input[@id='u_0_2']")   //login button
	WebElement loginBtn;
	
	//Methods....
	public void emailOrPhone() throws Exception //for email id or Phone
	{
		emailEtdBox.sendKeys(fu.getUserName());
		Thread.sleep(500);
		
	}
	public void pwLoginID() throws Exception //for password
	{
		pwEnterEdtBox.sendKeys(fu.getPassword());
		Thread.sleep(500);
		loginBtn.click();
	}
	
	
}