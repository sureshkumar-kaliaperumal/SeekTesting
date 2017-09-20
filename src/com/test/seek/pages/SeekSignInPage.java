package com.test.seek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeekSignInPage {
	WebDriver driver;
	By seekSignInLink = By.xpath("//*[@id=\'app\']/div/div[2]/header/section/div/span[2]/div[1]/div[2]/nav/a[1]");
	By seekSignInEmail = By.id("email");
	By seekSignInPassword = By.id("password");
	By seekSignInButn	= By.xpath("//*[@id='app']/div/main/div[2]/div/div/div[1]/div[2]/div[2]/form/div[4]/button");
	public SeekSignInPage(WebDriver driver) {
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
	
	
	public void signInToSeek(String strEmail, String strPassword) {
		//click Signin link
		this.clickSignInLink();
		
		//fill email
		this.setEmail(strEmail);
		
		//fill password
		this.setPassword(strPassword);
		
		//click Signin button
		this.clickSignInButn();
	}
	
}
