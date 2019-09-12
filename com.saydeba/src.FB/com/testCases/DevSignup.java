package com.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ObjectRepository.FbXpath;
import com.genericLib.BaseClass;
import com.genericLib.ExcelDataConfig;
import com.genericLib.FileUtils;
import com.genericLib.WebDriverCommonUtils;

public class DevSignup extends BaseClass
{
	WebDriverCommonUtils wdcu = new WebDriverCommonUtils();
//	FileUtils excelConfig = new FileUtils();
//	ExcelDataConfig excel = new ExcelDataConfig(excelConfig.getExcel());
	FbXpath fbxp = new FbXpath();
	
	@Test
	//public String signup() throws Exception {
//		System.setProperty("webdriver.chrome.driver", "E:\\BrowsersDrivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();
		//WebElement fn=wdriver.findElement(By.xpath("//input[@name='firstname']"));
		//fn.sendKeys("Dev");
		public void getFName1() throws Exception
		{
			Thread.sleep(500);
			wdcu.waitForPageToLoad();
			PageFactory.initElements(wdriver, fbxp);
			fbxp.nameFirst();
			//return excel.getData(0, 1, 0);
			
		}
		
//		WebElement ln=wdriver.findElement(By.name("lastname"));
//		ln.sendKeys("key");
//		WebElement mn=wdriver.findElement(By.name("reg_email__"));
//		mn.sendKeys("9742990465");
//		WebElement pw=wdriver.findElement(By.name("reg_passwd__"));
//		pw.sendKeys("QSpider");
//		
//		//Handling dropdowns using select 
//		WebElement dd=wdriver.findElement(By.name("birthday_day"));
//		Select day=new Select(dd);
//		day.selectByIndex(25);
//		
//		Thread.sleep(1000); //Java Synchronization statement
//		
//		WebElement mm=wdriver.findElement(By.name("birthday_month"));
//		Select mom=new Select(mm);
//		mom.selectByIndex(11);
//		//mom.selectByVisibleText("Nov");
//		
//		WebElement yy=wdriver.findElement(By.name("birthday_year"));
//		Select year=new Select(yy);
//		year.selectByValue("1982");
//		
//		//Handling Radio Buttons
//		
//		WebElement gg=wdriver.findElement(By.xpath("//label[text()='Male']"));
//		gg.click();
		
//		System.out.println("Male option is selected:"+gg.isEnabled());
//		System.out.println("Male option is selected:"+gg.isDisplayed());
//		System.out.println("Male option is selected:"+gg.isSelected());
		
//		wdriver.close();
	}
		
		
		
	
