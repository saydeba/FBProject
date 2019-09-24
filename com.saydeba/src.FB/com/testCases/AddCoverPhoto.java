package com.testCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.genericLib.*;

public class AddCoverPhoto extends BaseClass
{
	SayProfilePage sfp = new SayProfilePage();
	WebDriverCommonUtils wdcu = new WebDriverCommonUtils();
	
	@Test
	public void addcover() throws Exception
	{
		sfp.profile();
		System.out.println("under addcover method... after Add cover photo click");
		wdcu.waitForPageToLoad();
							
					//Screen for Your cover photo --> OK or SKIP or Direct
		wdriver.findElement(By.xpath("//span[contains(text(),'Add Cover Photo')]")).click();
		Thread.sleep(500);
		String nm="Your cover photo"; 
		if(nm.equals("Your cover photo")){
		switch(nm)
		//if(nm.equals("Your cover photo"))
		{   
		case "one":
			wdriver.findElement(By.xpath("//a[contains(text(),'Skip')]")).click();  // for SKIP
			wdriver.findElement(By.xpath("//span[contains(text(),'Add Cover Photo')]")).click();
			System.out.println("SKIP");
			wdriver.findElement(By.xpath("//span[contains(text(), 'Select photo')]")).click();
			Thread.sleep(500);
		
		//else if(nm.equals("Your cover photo"))
		case "two":
			wdriver.findElement(By.xpath("//button[contains(text(),'OK')]")).click(); // for OK
			//wdriver.findElement(By.xpath("//span[contains(text(),'Add Cover Photo')]")).click();
			System.out.println("OK");
			wdriver.findElement(By.xpath("//span[contains(text(), 'Select photo')]")).click();
			Thread.sleep(500);
		
		//else
		case "three":
			System.out.println("Without OK and Skip");
			//wdriver.findElement(By.xpath("//span[contains(text(),'Add Cover Photo')]")).click(); // for direct
			System.out.println("Add Cover Photo click inside");
			wdriver.findElement(By.xpath("//span[contains(text(), 'Select photo')]")).click();
			Thread.sleep(500);
		
			default:
				System.out.println("Default in Switch case");
				wdriver.findElement(By.xpath("//span[contains(text(), 'Select photo')]")).click();
		}
		Thread.sleep(1500);
		} 
		//==================Select photo clicking....
//		wdriver.findElement(By.xpath("//span[contains(text(), 'Select photo')]")).click();
//		Thread.sleep(5000);
//		wdriver.findElement(By.xpath("//span[contains(text(), 'Select artwork')]")).click();
//		Thread.sleep(5000);
//		wdriver.findElement(By.xpath("//label[contains(text(), 'Upload photo...')]")).click();
//		Thread.sleep(5000);
		
		String selectPhoto = "Choose From My Photos";
		String selectArtwork ="Select artwork";
		String uploadPhoto = "Upload photo...";
		
		if(selectPhoto.equals("Choose From My Photos"))
		{
			selectPhoto();
		}
		else if(selectArtwork.equals("Select artwork"))
		{
			selectArtwork();
		}
		else if(uploadPhoto.equals("Upload photo..."))
		{
			uploadPhoto();
		}
	}

	private void selectPhoto() throws Exception 
	{
		System.out.println("In the selectPhoto method");
		//Thread.sleep(500);
		String parentWindowHandler = wdriver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = wdriver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		wdriver.switchTo().window(subWindowHandler); // switch to sub window
	
			// in the sub window, perform necessary actions ....
       
//		System.out.println("click on photo albums.......");
//				//click on photo albums...
//		wdriver.findElement(By.xpath("//span[@class='fsl fwb']")).click();
		Thread.sleep(500);
			System.out.println("Recent Photos section.......");
		String rp= "Recent Photos";
		if(rp.equals("Recent Photos"))
		{
			//wdriver.findElement(By.xpath("//div[@class='uiScaledImageContainer'][1]")).click();
			
			wdriver.findElement(By.xpath("//a[@data-photo-id=\"130746331600525\"]")).click();
			
			  // Click on the photo for "cover photo"
			System.out.println("photo clicked.....");
			//
			//wdcu.waitForPageToLoad();
			Thread.sleep(800);
			wdriver.findElement(By.xpath("//button[contains(text(), 'Cancel')]")).click(); // switch it on
			//wdriver.findElement(By.xpath("//i[@class='img sp_XvdHefsjITT sx_aa0b1e')]")).click(); // mark off
			wdriver.switchTo().window(parentWindowHandler);  // switch back to parent window
	        wdriver.findElement(By.xpath("//span[contains(text(),'Add Cover Photo')]")).click();
	        selectArtwork();
		}
		else	
			wdriver.findElement(By.xpath("//a[contains(text(), 'Cancel')]")).click();
			wdriver.findElement(By.xpath("//span[contains(text(),'Add Cover Photo')]")).click();
//		wdriver.findElement(By.xpath("//a[contains(text(), 'Cancel')]")).click();
		
	}
	
	private void selectArtwork() 
	{
		
		System.out.println("Select Artwork link clicked.....");
	}

	private void uploadPhoto()
	{
		System.out.println("Select photo page clicked.....");
		
	}
	
}


//       //a[contains(text(),'Update')]


