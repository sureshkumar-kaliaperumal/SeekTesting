package com.test.seek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeekAccountDeletionPage {
	WebDriver driver;
	String str;
	By seekSignInLink = By.xpath("//*[@id=\'app\']/div/div[2]/header/section/div/span[2]/div[1]/div[2]/nav/a[1]");
	By seekSignInEmail = By.id("email");
	By seekSignInPassword = By.id("password");
	By seekSignInButn	= By.xpath("//*[@id='app']/div/main/div[2]/div/div/div[1]/div[2]/div[2]/form/div[4]/button");
	//By seekUserName = By.cssSelector("#app > div > div:nth-child(2) > header > section > div > span._3GlH2T8._1pia1SL > div._3vAiMK3._3LS17na.cDELXnQ > div._3q1w4kH > nav > label");
	By seekUserName = By.cssSelector("#app > div > header > section > div > span.__STYLE_GUIDE__Header__userWrapper___3GlH2T8.__STYLE_GUIDE__Hidden__print___1pia1SL > div.__STYLE_GUIDE__Header__user___3vAiMK3.__STYLE_GUIDE__Header__user_isAuthenticated___3LS17na.__STYLE_GUIDE__Header__user_isReady___cDELXnQ > div.__STYLE_GUIDE__Header__userAccountWrapper___3q1w4kH > nav > label > span:nth-child(2)");
	By settingLink = By.cssSelector("#app > div > header > section > div > span.__STYLE_GUIDE__Header__userWrapper___3GlH2T8.__STYLE_GUIDE__Hidden__print___1pia1SL > div.__STYLE_GUIDE__Header__user___3vAiMK3.__STYLE_GUIDE__Header__user_isAuthenticated___3LS17na.__STYLE_GUIDE__Header__user_isReady___cDELXnQ > div.__STYLE_GUIDE__Header__userAccountWrapper___3q1w4kH > nav > div.__STYLE_GUIDE__UserAccount__toggleContainer___1OrVNW3 > ul > li:nth-child(8) > a");
	By delLink = By.cssSelector("body > main > div > p.pl-two > a");
	By permDelAccButn = By.id("Submit1");
	By confirmation = By.cssSelector("#bodyContainer > div.myaccount-deleteaccountsuccess.mod-section.state-section-page.l-clearfix.l-row > h1");
	
	public SeekAccountDeletionPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//click Sign in link
	public void clickSignInLink() {
		driver.findElement(seekSignInLink).click();
	}
	
	//set email id in text box
	public void setEmail(String strEmail) {
		driver.findElement(seekSignInEmail).sendKeys( strEmail);
	}
	
	//set password in text box
	public void setPassword(String strPassword) {
		driver.findElement(seekSignInPassword).sendKeys( strPassword);
	}
	
	//click signin button
	public void clickSignInButn() {

		//click the sign in button(fixed the no such clickable element
		
		WebElement element = driver.findElement(seekSignInButn);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
	
	}
	
	//click the settings
	public void clickSetting() {
		
	   	 driver.findElement(seekUserName).click();
	   	 
	   	 driver.findElement(settingLink).click();
	}
	
	//click the delete link
	
	public void clickDelLink() {
	   	 WebElement element = driver.findElement(delLink);
	   	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	   	 executor.executeScript("arguments[0].click()", element);
	}
    
	//click permanent deletion button
	
	public void permDelButton() {
		driver.findElement(permDelAccButn).click();
	}
	
    public String getConfirmation() {
    	str = driver.findElement(confirmation).getText();
    	return str;
    }
	
	
	public void signInToSeekAndDelAccount(String strEmail, String strPassword) {
		//click Signin link
		this.clickSignInLink();
		
		//fill email
		this.setEmail(strEmail);
		
		//fill password
		this.setPassword(strPassword);
		
		//click Signin button
		this.clickSignInButn();
		
		//click setting link
		this.clickSetting();
		
		//click delete link
		this.clickDelLink();
		
		//press permanent deletion button
		this.permDelButton();
		
	}

}
