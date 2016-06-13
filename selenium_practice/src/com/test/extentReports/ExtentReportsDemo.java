package com.test.extentReports;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.test.Utility.getScreenshot;

public class ExtentReportsDemo {
	
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	
	@Test
	public void wordpressLoginReport()
	{
		
		report= new ExtentReports("/Users/Savanth/Desktop/report.html", true);
		
		logger= report.startTest("WordpressLogin");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		logger.log(LogStatus.INFO, "Browser Started");
		
		driver.get("https://mydemosite8113.wordpress.com/wp-login.php");
		
		logger.log(LogStatus.INFO, "WordPress Page opened");
		
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("saibersys1987@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("saibersys12345");
		
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		
		logger.log(LogStatus.INFO, "Login Credentials Provided");
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
		logger.log(LogStatus.PASS, "Login successfull");
		
		
	}

	@AfterMethod
	public void safeExit(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			String screenshot_path= getScreenshot.captureScreenshot(driver, result.getName());
			
			logger.log(LogStatus.FAIL, "Login Verification", screenshot_path);
		}
		
		report.endTest(logger);
		
		report.flush();
		
		driver.get("/Users/Savanth/Desktop/report.html");
	}
}
