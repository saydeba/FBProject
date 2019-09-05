package com.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileUtils 
{
Properties pro;
	
	public FileUtils()
	{
		try
		{
			File src = new File("./configuration/config.properties");
			FileInputStream fis = new FileInputStream(src);
		    pro= new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is: "+e.getMessage());
		}
	}
	
	public String getChromePath()
	{
		return pro.getProperty("ChromeDriver");
	}
	public String getURL()
	{
		return pro.getProperty("URL");
	}
	public String getUserName()
	{
		return pro.getProperty("UserName");
	}
	public String getPassword()
	{
		return pro.getProperty("Password");
	}


}
