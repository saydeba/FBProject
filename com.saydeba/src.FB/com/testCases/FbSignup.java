package com.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.ObjectRepository.FbXpath;
import com.genericLib.BaseClass;
import com.genericLib.WebDriverCommonUtils;

public class FbSignup extends BaseClass
{
	WebDriverCommonUtils wdcu = new WebDriverCommonUtils();
	FbXpath fbxp = new FbXpath();
	
	@Test
	
		public void getFName() throws Exception
		{
			Thread.sleep(500);
			wdcu.waitForPageToLoad();
			PageFactory.initElements(wdriver, fbxp);
			fbxp.nameFirst();
			fbxp.nameSur();
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
		
		
		
	
