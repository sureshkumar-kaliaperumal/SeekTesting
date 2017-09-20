
package com.test.seek.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.seek.pages.JobSearchPage;
import com.test.seek.pages.SeekSignInPage;
import com.test.seek.pages.SeekSignOutPage;
import com.test.seek.pages.SuccessRegisterPage;

public class TestJobSearch {
	WebDriver driver;
	SeekSignInPage objSeekSignInPage;
	SeekSignOutPage objSeekSignOutPage;
	JobSearchPage objJobSearchPage;
	String geckoDriverPath = "c:\\tools\\chromedriver.exe";
	String url = "https://www.seek.com.au/";
	
	@BeforeTest
	
	//Launch the Seek portal using chrome driver
	public void setUp() {
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
	
	public void testJobSearchPage() {
		objSeekSignInPage = new SeekSignInPage(driver);
		objSeekSignOutPage = new SeekSignOutPage(driver);
		objSeekSignInPage.signInToSeek("suresh@gmail.com","abcd1234");
		
		SuccessRegisterPage objRegisterSuccess = new SuccessRegisterPage(driver);
	    //Verify success register page
		String str1 = objRegisterSuccess.getDashboardUserName();
		//System.out.println(str1);
	    Assert.assertTrue(str1.toLowerCase().contains("suresh"));
	    
	    objJobSearchPage = new JobSearchPage(driver);
	    objJobSearchPage.clickJobSearchLink();
	    objJobSearchPage.searchJob("selenium");
	    
	}
	
	@AfterClass
	
	public void closeDriver() {
		System.out.println("Test5: Job search applied and saved the job search");
		driver.close();
	}
}

