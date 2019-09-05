package com.genericLib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.*;

/*
 * To execute listener activity, this BaseClass & CustomerTest files needed and run it from testngListener.xml 
 */
public class Listener implements ITestListener 
{
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String failedTestName = result.getMethod().getMethodName();
		System.out.println("Test Fail: " + failedTestName + ".png");
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.wdriver);
		
		String fileImgPath = "./screenShot\\";
		File srcFile = edriver.getScreenshotAs(OutputType.FILE);
		
		File dstFile = new File(fileImgPath.concat(failedTestName)+".png");
		try
		{
			FileUtils.copyFile(srcFile, dstFile);
		}
		catch (Exception e)
		{}
			
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

}
