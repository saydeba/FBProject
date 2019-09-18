package com.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.ObjectRepository.FbXpath;
import com.ObjectRepository.LogoutFB;
import com.genericLib.BaseClass;
import com.genericLib.ExcelDataConfig;
import com.genericLib.FileUtils;
import com.genericLib.WebDriverCommonUtils;

public class FbSignup extends BaseClass
{
	WebDriverCommonUtils wdcu = new WebDriverCommonUtils();
	FbXpath fbxp = new FbXpath();
	LogoutFB lm = new LogoutFB();
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
			fbxp.dayYear(Integer.toString(excel.getIntData(0, 1, 6)));
			
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
			
//			do{  
//				lm.logoutMenu();
//				lm.signout();
//		    }
//			while(fbxp.submitButton()); 
			
		}
	
	@Test
	public void getNewSign() throws Exception
	{
		//fbxp.creaPageOthers();
	
	}
		
}
		
		
		
	
