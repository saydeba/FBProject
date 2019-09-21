package com.genericLib;

import org.openqa.selenium.*;
import org.testng.annotations.Test;
import com.ObjectRepository.*;

public class SayProfilePage extends BaseClass
{
	FbXpath fbxp = new FbXpath();
	WebDriverCommonUtils wdcu = new WebDriverCommonUtils();
	
	
	@Test
	public void profile() throws Exception
	{
		wdriver.findElement(By.xpath("//a[@title='Profile']")).click();
		wdcu.waitForPageToLoad();
		
	}
	
}
		
		