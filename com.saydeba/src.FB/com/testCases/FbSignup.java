package com.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.ObjectRepository.FbXpath;
import com.genericLib.BaseClass;
import com.genericLib.ExcelDataConfig;
import com.genericLib.FileUtils;
import com.genericLib.WebDriverCommonUtils;

public class FbSignup extends BaseClass
{
	WebDriverCommonUtils wdcu = new WebDriverCommonUtils();
	FbXpath fbxp = new FbXpath();
	FileUtils excelConfig = new FileUtils();
	ExcelDataConfig excel = new ExcelDataConfig(excelConfig.getExcel());
	
	@Test
	
		public void getSign() throws Exception
		{
			Thread.sleep(500);
			wdcu.waitForPageToLoad();
			PageFactory.initElements(wdriver, fbxp);
			fbxp.nameFirst();
			fbxp.nameSur();
			fbxp.signEmail();
				Thread.sleep(200);
			fbxp.confSignEmail();
			fbxp.regPw();
			fbxp.dayDate();
			fbxp.dayMonth();
				Thread.sleep(200);
			fbxp.dayYear();
			//fbxp.dayYear(excel.getIntData(0, 1, 6));
			
			String gender = excel.getStringData(0, 1, 7);
			if((gender.toLowerCase()).equals("female"))
			{
				fbxp.optionFemale();
			}
			else if((gender.toLowerCase()).equals("male"))
			{
				fbxp.optionMale();
			}
			else if((gender.toLowerCase()).equals("custom"))
			{
				fbxp.optionCustom();
			}
			else{};
			
		}
		
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
		
		
		
	
