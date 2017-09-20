package com.test.seek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class JobSearchPage {
	WebDriver driver;
	By JobSearchLink = By.linkText("Job Search");
	By keywordsSearchTxtBox = By.id("SearchBar__Keywords");
	By classificationTxtBox = By.cssSelector("#SearchBar > div > div._19eV0AS._1_WWQuh > div > div.qGGmKQS._2Y_Y160 > label");
	By classificationLiPath = By.cssSelector("#classificationsPanel > nav > ul > li:nth-child(18) > a");
	By whereTxtBox = By.id("SearchBar__Where");
	By whereLiPath = By.xpath("//*[@id=\'react-autowhatever-1-section-0-item-0\']/span");
	//By seekButn = By.xpath("//*[@id='SearchBar']/div/div[2]/div/div/div[2]");
	By seekButn = By.cssSelector("#SearchBar > button");
	By saveSearchButn = By.cssSelector("#app > div > div:nth-child(2) > div:nth-child(3) > div > div._1fg4ez2._3hRRmf_ > span > div > section > div._2e_z5S_ > div > div._3stY0dI > span > div:nth-child(1) > div > div > button");
	By checkText =  By.cssSelector("#app > div > div:nth-child(2) > div:nth-child(3) > div > div._1fg4ez2._3hRRmf_ > span > div > section > div._2e_z5S_ > div > div._3stY0dI > span > div:nth-child(1) > div > div > span > span > span");
	By userAcctName = By.cssSelector("#app > div > div:nth-child(2) > header > section > div > span._3GlH2T8._1pia1SL > div._3vAiMK3._3LS17na.cDELXnQ > div._3q1w4kH > nav > label > span:nth-child(2)");
	By signOut = By.cssSelector("#app > div > div:nth-child(2) > header > section > div > span._3GlH2T8._1pia1SL > div._3vAiMK3._3LS17na.cDELXnQ > div._3q1w4kH > nav > div._1OrVNW3 > ul > li:nth-child(11) > a");
	//constructor
		public JobSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//click jobsearch link
		public  void clickJobSearchLink() {
		driver.findElement(JobSearchLink).click();
	}
	
	//set keyword textbox
	public void enterKeyword(String strKeyword) {
		driver.findElement(keywordsSearchTxtBox).sendKeys(strKeyword);
	}
	
	//
	
	public void enterClassification() {
		driver.findElement(classificationTxtBox).click();
		WebElement element = driver.findElement(classificationLiPath);
		element.sendKeys(Keys.SPACE);
	}
	
	//select options from <Input> based dropdown menus using Li path
	public void enterWhere() {
		WebElement element = driver.findElement(whereTxtBox);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		driver.findElement(whereTxtBox).click();
		driver.findElement(whereLiPath).click();
	}
	
	//click the Seek button
	public void clickSeekButn() {
		//driver.findElement(seekButn).click();
		
		WebElement element = driver.findElement(seekButn);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", element);
		
	}
	
	public void clickSaveSearchButn() {
		driver.findElement(saveSearchButn).click();
	}
	
	public void verifyText() {
		String str = driver.findElement(checkText).getText();
		Assert.assertTrue(str.contains("Search saved as Selenium In All Sydney NSW. Manage saved searches via the account menu"));
	}
	
    public void pressSignout(){

   	 driver.findElement(userAcctName).click();
   	 driver.findElement(signOut).click();
   	 //driver.close();
   }
	
	public void searchJob(String strKeyword) {
		
		this.enterKeyword(strKeyword);
		
		this.enterClassification();
		
		this.enterWhere();
		
		this.clickSeekButn();
		
		this.clickSaveSearchButn();
		
		this.verifyText();
		
		this.pressSignout();
	}
}
