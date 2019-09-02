package com.genericLib;

import java.util.concurrent.TimeUnit;

public class webDriverCommonUtils
{
	public void waitForPageToLoad()
	{
		baseClassTest.wdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	

}