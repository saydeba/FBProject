package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericLib.BaseClass;
import com.genericLib.ExcelDataConfig;
import com.genericLib.FileUtils;

public class FbXpath extends BaseClass
{
	FileUtils fu = new FileUtils();
//	DataReturn fsu = new DataReturn();
	FileUtils excelConfig = new FileUtils();
	ExcelDataConfig excel = new ExcelDataConfig(excelConfig.getExcel());
	
	//data member field...
	@FindBy(name="email")  //email enter....
	WebElement emailEtdBox;
	
	@FindBy(name ="pass")  //password enter
	WebElement pwEnterEdtBox;
	
	@FindBy(xpath="//input[@value='Log In']")   //login button
	WebElement loginBtn;
	
	@FindBy(xpath="//span[@class='_1vp5']") //Home button
	WebElement clickHome;
	
	@FindBy(xpath="//input[@name='firstname']")	//Signup First Name
	WebElement fname;
	
	@FindBy(name="lastname")	//Signup SurName
	WebElement sname;
	
	
	//Methods...............
	
	public void emailOrPhone() throws Exception //for email id or Phone
	{
		emailEtdBox.sendKeys(fu.getUserName());
		Thread.sleep(500);
	}
	public void pwLoginID() throws Exception //for password
	{
		pwEnterEdtBox.sendKeys(fu.getPassword());
		loginBtn.click();
		Thread.sleep(200);
		wdriver.manage().window().maximize();
	}
	public void clickHome() throws Exception   // for Home click
	{
		System.out.println("home click");
		clickHome.click();	
		Thread.sleep(500);	
	}
	public void nameFirst() throws Exception
	{		
		fname.sendKeys(excel.getData(0, 1, 0));
		Thread.sleep(200);
	}
	
	public void nameSur() throws Exception
	{		
		sname.sendKeys(excel.getData(0, 1, 1));
		Thread.sleep(200);
	}
	
	
	
	
	
	
	
}
