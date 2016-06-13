package com.test.Wordpresspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage()
	{
		super();
	}
	
	@FindBy(id ="user_login")
	@CacheLookup
	WebElement uid;
	
	@FindBy(how=How.XPATH, using=".//*[@id='user_pass']")
	@CacheLookup
	WebElement passwd;
	
	@FindBy(how=How.ID,using="wp-submit")
	@CacheLookup
	WebElement loginButton;
	
	public void login_wordpress(String userid, String password)
	{
		uid.sendKeys(userid);
		passwd.sendKeys(password);
		loginButton.click();
	
	}

	public LoginPage(WebDriver ldriver) {
		this.driver= ldriver;
		
	}
	
	

}
