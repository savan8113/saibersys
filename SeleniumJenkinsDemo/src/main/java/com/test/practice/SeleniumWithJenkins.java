package com.test.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumWithJenkins {
	
	@Test
	public void testTitle()
	{
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mydemosite8113.wordpress.com/wp-login.php");
		
		System.out.println(driver.getTitle());
	}

}
