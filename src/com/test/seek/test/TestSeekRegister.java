package com.test.seek.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.test.seek.pages.SeekRegisterPage;
import com.test.seek.pages.SeekSignOutPage;
import com.test.seek.pages.SuccessRegisterPage;

public class TestSeekRegister {
	WebDriver driver;
	SeekRegisterPage objRegister;
	String geckoDriverPath = "c:\\tools\\chromedriver.exe";
	String url = "https://www.seek.com.au/";
	SuccessRegisterPage objRegisterSuccess;
	
	@BeforeTest
	
	public void setUp() {
		//Set chrome geckoDriver path
		try {	
			System.setProperty("webdriver.chrome.driver", geckoDriverPath);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test(priority=0)
	
	//register to seek.com.au
	public void testRegisterPage() {
		
		objRegister = new SeekRegisterPage(driver);
		objRegister.clickRegisterLink();
		objRegister.registerToSeek("Suresh","K","suresh@gmail.com","abcd1234");
		
		objRegisterSuccess = new SuccessRegisterPage(driver);
	    //Verify success register page
		String str1 = objRegisterSuccess.getDashboardUserName();
	    Assert.assertTrue(str1.toLowerCase().contains("suresh"));
	    
	}
	
	@AfterClass
	
	public void closeDriver() {
		System.out.println("Test2: New account successfully registered");
		driver.close();
	}
	
}
