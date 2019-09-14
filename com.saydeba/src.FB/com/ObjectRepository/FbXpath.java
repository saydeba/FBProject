package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.genericLib.BaseClass;
import com.genericLib.ExcelDataConfig;
import com.genericLib.FileUtils;

public class FbXpath extends BaseClass
{
	FileUtils fu = new FileUtils();
	FileUtils excelConfig = new FileUtils();
	ExcelDataConfig excel = new ExcelDataConfig(excelConfig.getExcel());
	
	//Elements.....
	
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
	
	@FindBy(name="reg_email__")	//email or phone
	WebElement signEmail;
	
	@FindBy(name="reg_email_confirmation__")	//confirmation email
	WebElement confSignEmail;
	
	@FindBy(name="reg_passwd__")	//Register password
	WebElement regPw;
	
	@FindBy(xpath="//select[@name='birthday_day']")	//Choose Day
	WebElement dayBirthDate;
	
	@FindBy(xpath="//select[@name='birthday_month']")	//Choose month
	WebElement dayBirthMonth;
	
	@FindBy(xpath="//select[@name='birthday_year']")	//Choose year
	WebElement dayBirthYear;
	
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
	}
	public void clickHome() throws Exception   // for Home click
	{
		System.out.println("home click");
		clickHome.click();	
		Thread.sleep(500);	
	}
	public void nameFirst() throws Exception
	{		
		fname.sendKeys(excel.getStringData(0, 1, 0));
		Thread.sleep(200);
	}
	
	public void nameSur() throws Exception
	{		
		sname.sendKeys(excel.getStringData(0, 1, 1));
		Thread.sleep(200);
	}
	
	public void signEmail() throws Exception
	{
		signEmail.sendKeys(excel.getStringData(0, 1, 2));
	}
	
	public void confSignEmail() throws Exception
	{
		confSignEmail.sendKeys(excel.getStringData(0, 1, 2));
	}
	
	public void regPw() throws Exception
	{
		regPw.sendKeys(excel.getStringData(0, 1, 3));
	}
	
	public void dayDate() throws Exception
	{
		Select day = new Select(dayBirthDate);
		day.selectByIndex(excel.getIntData(0, 1, 4));
	}
	public void dayMonth() throws Exception 
	{
		Select month = new Select(dayBirthMonth);
		month.selectByIndex(excel.getIntData(0, 1, 5));
	}
	public void dayYear() throws Exception  
	{
		Select year = new Select(dayBirthYear);	
		Thread.sleep(200);
		year.selectByIndex(excel.getIntData(0, 1, 6));
		
	}
	
	
}
