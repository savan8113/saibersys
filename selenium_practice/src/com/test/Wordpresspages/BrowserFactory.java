package com.test.Wordpresspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getDriver(String browser, String url)
	{
		if (browser.equalsIgnoreCase("firefox"))
				driver= new FirefoxDriver();
		else if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("IExplorer"))
			driver= new InternetExplorerDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
	

}
