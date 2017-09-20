package com.test.seek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeekRegisterPage {
	WebDriver driver;
	By seekFirstName = By.id("firstName");
	By seekLastName = By.id("lastName");
	By seekEmail = By.id("email");
	By seekPassword = By.id("password");
	By seekRegisterButn = By.xpath("//*[@id=\'app\']/div/main/div[2]/div/div/div[1]/div[2]/div[2]/form/button");
	//By seekRegisterLink = By.linkText("Register");
	By seekRegisterLink = By.xpath("//*[@id='app']/div/div[2]/header/section/div/span[2]/div[1]/div[2]/nav/a[2]");
	
	public SeekRegisterPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	// set first name in text box
	public void setFirstName(String strFirstName) {
		driver.findElement(seekFirstName).sendKeys(strFirstName);
	}
	
	//set last name in text box
	public void setLastName(String strLastName) {
		driver.findElement(seekLastName).sendKeys(strLastName);
	}
	
	//set email id in text box
	public void setEmail(String strEmail) {
		driver.findElement(seekEmail).sendKeys(strEmail);
	}
	
	//set password in text box
	public void setPassword(String strPassword) {
		driver.findElement(seekPassword).sendKeys(strPassword);
	}
	
	//click on register button
	public void clickRegister() {
		//driver.findElement(seekRegisterButn).click();
	   	 WebElement element = driver.findElement(seekRegisterButn);
	   	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	   	 executor.executeScript("arguments[0].click()", element);
		
		
	}
	
	//click on register link
	public void clickRegisterLink() {
		driver.findElement(seekRegisterLink).click();
	}
	
	
	public void registerToSeek(String strFirstName, String strLastName, String strEmail, String strPassword) {
		//fill first name
		this.setFirstName(strFirstName);
		
		//fill last name
		this.setLastName(strLastName);
		
		//fill email
		this.setEmail(strEmail);
		
		//fill password
		this.setPassword(strPassword);
		
		//click register button
		this.clickRegister();
		
	}
}
