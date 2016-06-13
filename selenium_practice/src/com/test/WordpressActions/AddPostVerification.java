package com.test.WordpressActions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.Wordpresspages.BrowserFactory;
import com.test.Wordpresspages.HomePage;
import com.test.Wordpresspages.LoginPage;

public class AddPostVerification {
	
	@Test
	public void addPostVerification() throws InterruptedException{
		
//		WebDriver driver= BrowserFactory.getDriver("firefox", "https://mydemosite8113.wordpress.com/wp-admin/");
		
		WebDriver driver= BrowserFactory.getDriver("firefox","https://mydemosite8113.wordpress.com/wp-login.php");
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.login_wordpress("saibersys1987@gmail.com", "saibersys12345");
		
		HomePage homePage= PageFactory.initElements(driver, HomePage.class);
		
		homePage.verifyAddPost("This is a practice on Selenium", driver);
		
//		driver.quit();
	}

}
