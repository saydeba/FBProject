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
	
	@FindBy(xpath="//input[@type='submit']")   //login button  //input[@value='Log In']
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
	
	@FindBy(xpath="//input[@value='1']")	//Choose Female
	WebElement optionFemale;
	
	@FindBy(xpath="//input[@value='2']")	//Choose Mmale
	WebElement optionMale;
	
	@FindBy(xpath="//input[@value='-1']")	//Choose Custom
	WebElement optionCustom;
	
	@FindBy(name="websubmit")	// submit button... signup page
	WebElement submitButton;
	
	@FindBy(xpath="//a[@class='_8esh']")
	WebElement creaPageOthers;
	
	@FindBy(name="q")  //input[@name='q'
	WebElement searchBox;
	
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
	public void dayYear(String yr) throws Exception 
	{ 
		  Select year = new	Select(dayBirthYear);
		  year.selectByValue(yr);
	}
	public void optionFemale() throws Exception  
	{
		optionFemale.click();
	}
	public void optionMale() throws Exception  
	{
		optionMale.click();
	}
	public void optionCustom() throws Exception  
	{
		optionCustom.click();
	}
	public boolean submitButton() throws Exception  
	{
		submitButton.click();
		return false;
	}
	public void creaPageOthers() throws Exception  
	{
		creaPageOthers.click();
	}
	
	public void searchBox() throws Exception  
	{
		searchBox.sendKeys("sayak chaudhuri");
	}
	
	
}
