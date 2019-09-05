package com.genericLib;

import java.util.concurrent.TimeUnit;

public class WebDriverCommonUtils
{
	public void waitForPageToLoad()
	{
		BaseClass.wdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}
	

}