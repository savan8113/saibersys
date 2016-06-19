package com.test.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataDrivenDemo {
	
	
	WebDriver driver;
	
	@Test(dataProvider="loginData")
	public void loginDemo(String username, String password) throws InterruptedException
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mydemosite8113.wordpress.com/wp-login.php");
		
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		Thread.sleep(1000);
		
		
	}
	@AfterMethod
	public void driverQuit()
	{
		driver.quit();
	}
	
	@DataProvider(name="loginData")
	public Object[][] logindetails()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="savanth";
		
		data[0][1]="demo123";
		
		data[1][0]="savanth.ch@gmail";
		
		data[1][1]="Nanu123";
		
		data[2][0]="savanth.ch@gmail.com";
		
		data[2][1]="Nanu@8113";
		
		return data;
		
	}

}
