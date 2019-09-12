package com.testCases;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DevSignup {

	@Test
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\BrowsersDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement fn=driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("Dev");
		WebElement ln=driver.findElement(By.name("lastname"));
		ln.sendKeys("key");
		WebElement mn=driver.findElement(By.name("reg_email__"));
		mn.sendKeys("9742990465");
		WebElement pw=driver.findElement(By.name("reg_passwd__"));
		pw.sendKeys("QSpider");
		
		//Handling dropdowns using select 
		WebElement dd=driver.findElement(By.name("birthday_day"));
		Select day=new Select(dd);
		day.selectByIndex(25);
		
		Thread.sleep(1000); //Java Synchronization statement
		
		WebElement mm=driver.findElement(By.name("birthday_month"));
		Select mom=new Select(mm);
		mom.selectByIndex(11);
		//mom.selectByVisibleText("Nov");
		
		WebElement yy=driver.findElement(By.name("birthday_year"));
		Select year=new Select(yy);
		year.selectByValue("1982");
		
		//Handling Radio Buttons
		
		WebElement gg=driver.findElement(By.xpath("//label[text()='Male']"));
		gg.click();
		
//		System.out.println("Male option is selected:"+gg.isEnabled());
//		System.out.println("Male option is selected:"+gg.isDisplayed());
//		System.out.println("Male option is selected:"+gg.isSelected());
		
		driver.close();
	}
		
		
		
	
}