package com.test.seek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeekSignOutPage {
	WebDriver driver;
	//By seekUserName = By.cssSelector("#app > div > header > section > div > span.__STYLE_GUIDE__Header__userWrapper___3GlH2T8.__STYLE_GUIDE__Hidden__print___1pia1SL > div.__STYLE_GUIDE__Header__user___3vAiMK3.__STYLE_GUIDE__Header__user_isAuthenticated___3LS17na.__STYLE_GUIDE__Header__user_isReady___cDELXnQ > div.__STYLE_GUIDE__Header__userAccountWrapper___3q1w4kH > nav > label > span:nth-child(2)");
	//By seekUserName = By.cssSelector("#app > div > div:nth-child(2) > header > section > div > span._3GlH2T8._1pia1SL > div._3vAiMK3._3LS17na.cDELXnQ > div._3q1w4kH > nav > label");
	//By signOutLink = By.cssSelector("#app > div > header > section > div > span.__STYLE_GUIDE__Header__userWrapper___3GlH2T8.__STYLE_GUIDE__Hidden__print___1pia1SL > div.__STYLE_GUIDE__Header__user___3vAiMK3.__STYLE_GUIDE__Header__user_isAuthenticated___3LS17na.__STYLE_GUIDE__Header__user_isReady___cDELXnQ > div.__STYLE_GUIDE__Header__userAccountWrapper___3q1w4kH > nav > div.__STYLE_GUIDE__UserAccount__toggleContainer___1OrVNW3 > ul > li:nth-child(11) > a");
	//By signOutLink = By.cssSelector("#app > div > div:nth-child(2) > header > section > div > span._3GlH2T8._1pia1SL > div._3vAiMK3._3LS17na.cDELXnQ > div._3q1w4kH > nav > label > span:nth-child(2)");
	
	//By signOutLink = By.cssSelector("#app > div > header > section > div > span.__STYLE_GUIDE__Header__userWrapper___3GlH2T8.__STYLE_GUIDE__Hidden__print___1pia1SL > div.__STYLE_GUIDE__Header__user___3vAiMK3.__STYLE_GUIDE__Header__user_isAuthenticated___3LS17na.__STYLE_GUIDE__Header__user_isReady___cDELXnQ > div.__STYLE_GUIDE__Header__userAccountWrapper___3q1w4kH > nav > div.__STYLE_GUIDE__UserAccount__toggleContainer___1OrVNW3 > ul > li:nth-child(11) > a");
	By signOutLink = By.cssSelector("#app > div > header > section > div > span.__STYLE_GUIDE__Header__userWrapper___3GlH2T8.__STYLE_GUIDE__Hidden__print___1pia1SL > div.__STYLE_GUIDE__Header__user___3vAiMK3.__STYLE_GUIDE__Header__user_isAuthenticated___3LS17na.__STYLE_GUIDE__Header__user_isReady___cDELXnQ > div.__STYLE_GUIDE__Header__userAccountWrapper___3q1w4kH > nav > div.__STYLE_GUIDE__UserAccount__toggleContainer___1OrVNW3 > ul > li:nth-child(11) > a");
	By seekUserName = By.cssSelector("#app > div > header > section > div > span.__STYLE_GUIDE__Header__userWrapper___3GlH2T8.__STYLE_GUIDE__Hidden__print___1pia1SL > div.__STYLE_GUIDE__Header__user___3vAiMK3.__STYLE_GUIDE__Header__user_isAuthenticated___3LS17na.__STYLE_GUIDE__Header__user_isReady___cDELXnQ > div.__STYLE_GUIDE__Header__userAccountWrapper___3q1w4kH > nav > label > span:nth-child(2)");
	public SeekSignOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
    //click the signout link

    public void pressSignout(){

    	 driver.findElement(seekUserName).click();
    	 driver.findElement(signOutLink).click();
    	 //driver.close();
    }

}
