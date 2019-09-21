package com.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.genericLib.*;

public class AddCoverPhoto extends BaseClass
{
	SayProfilePage sfp = new SayProfilePage();
	
	@Test
	public void addcover() throws Exception
	{
		sfp.profile();
		wdriver.findElement(By.xpath("//span[contains(text(),'Add Cover')]")).click();

		String nm="Your cover photo";
		if(nm.equals("Your cover photo"))
		{                          
			wdriver.findElement(By.xpath("//a[contains(text(),'Skip')]")).click();
			wdriver.findElement(By.xpath("//div[@id='fbProfileCoverPhotoSelector']")).click();
			//System.out.println("SKIP");
			Thread.sleep(300);

		}
		else if(nm.equals("Your cover photo"))
		{
			wdriver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
			wdriver.findElement(By.xpath("//div[@id='fbProfileCoverPhotoSelector']")).click();
			//System.out.println("OK");
			Thread.sleep(300);

		}
		else
		{
			wdriver.findElement(By.xpath("//div[@id='fbProfileCoverPhotoSelector']")).click();
			//System.out.println("Add Cover Photo click inside");
			Thread.sleep(300);
		}

		//	wdriver.findElement(By.xpath("//div[@id='fbProfileCoverPhotoSelector']")).click();
		//	System.out.println("Add Cover Photo click outside");

	}
}


