package com.test.seek.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.seek.pages.SeekAccountDeletionPage;
import com.test.seek.pages.SeekSignInPage;
import com.test.seek.pages.SuccessRegisterPage;

public class TestDelSeekAccount {
	WebDriver driver;
	public SeekAccountDeletionPage objDelAccount;
	SeekSignInPage objSeekSignInPage;
	TestSeekRegister objTestSeekRegister;
	SuccessRegisterPage objRegisterSuccess;
	String geckoDriverPath = "c:\\tools\\chromedriver.exe";
	String url = "https://www.seek.com.au/";
	
	@BeforeTest
	
	//Launch the Seek portal using chrome driver
	public void setUp() {
		/*objTestSeekRegister = new TestSeekRegister();
		objTestSeekRegister.setUp();*/
		
		//try {	
			System.setProperty("webdriver.chrome.driver", geckoDriverPath);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
		/*} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
	
	@Test(priority=0)
	
	public void testDelSeekAccountPage() {
		objDelAccount = new SeekAccountDeletionPage(driver);
		objDelAccount.signInToSeekAndDelAccount("suresh@gmail.com","abcd1234");
		
	    //Check whether the seek account deleted
		String str1 = objDelAccount.getConfirmation();
	    Assert.assertTrue(str1.contains("Account deleted"));
	    
	}
	
	@AfterClass
	
	public void closeDriver() {
		System.out.println("Test1: An existing seek account has been successfully deleted");
		driver.close();
	}

}
