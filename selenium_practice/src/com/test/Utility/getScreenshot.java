package com.test.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class getScreenshot {

	
	public static String captureScreenshot(WebDriver driver, String screenshotName) throws IOException{
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source= ts.getScreenshotAs(OutputType.FILE);
		
		String dest= "./Screenshots/"+screenshotName+".png";
		
		File destination= new File(dest);
		
		FileUtils.copyFile(source, destination);
		
		return dest;
		
		
	}
}
