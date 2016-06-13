package com.test.ScreenshotDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.test.Utility.getScreenshot;

public class CaptureScreenshot {

	
	WebDriver driver;
	
	@Test
	public void facebookLoginScreenshot() throws Exception{
		
	driver= new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath(".//*[@id='emailjvj']")).sendKeys("abcd@gmail.com");

	
	}
	
	@AfterMethod
	public void closeDriver(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			getScreenshot.captureScreenshot(driver, "fail");
		}
		
		driver.quit();
	}
	

}
