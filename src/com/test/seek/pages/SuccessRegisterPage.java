package com.test.seek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessRegisterPage {
	WebDriver driver;
	By seekUserName = By.cssSelector("#app > div > header > section > div > span.__STYLE_GUIDE__Header__userWrapper___3GlH2T8.__STYLE_GUIDE__Hidden__print___1pia1SL > div.__STYLE_GUIDE__Header__user___3vAiMK3.__STYLE_GUIDE__Header__user_isAuthenticated___3LS17na.__STYLE_GUIDE__Header__user_isReady___cDELXnQ > div.__STYLE_GUIDE__Header__userAccountWrapper___3q1w4kH > nav > label > span:nth-child(2)");

	public SuccessRegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
    //Get the User name from Success Page

    public String getDashboardUserName(){

    	return    driver.findElement(seekUserName).getText();

    }
}
