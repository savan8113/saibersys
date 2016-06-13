package com.test.WordpressActions;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.Wordpresspages.BrowserFactory;
import com.test.Wordpresspages.LoginPage;

public class LoginValidation {
	
	
	
	//LoginPage login_page= new LoginPage(driver);
	
	@Test
	public void checklogin()
	{
		WebDriver driver= BrowserFactory.getDriver("firefox","https://mydemosite8113.wordpress.com/wp-login.php");
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.login_wordpress("savanth.ch@gmail.com", "Nanu@8113");
		
	}
	

}
