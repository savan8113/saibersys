package com.test.basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class ECommAppDemo {
	
	@Test
	public void freechargeDemo() throws MalformedURLException, InterruptedException
	{
		File app=new File("/Users/Savanth/Documents/workspace/AppiumDemo/apk/freecharge.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,1000);
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		try{
			driver.findElement(By.className("android.widget.RelativeLayout")).click();
			
			driver.swipe(700,850,10,850,1000);
			
			driver.findElement(By.className("android.widget.RelativeLayout")).click();
			
			driver.swipe(700,850,10,850,1000);
			
			driver.findElement(By.className("android.widget.RelativeLayout")).click();
			
			driver.swipe(700,850,10,850,1000);
			
			driver.findElement(By.className("android.widget.RelativeLayout")).click();
			
			driver.swipe(700,850,10,850,1000);
			
		}catch(Exception e)
			{
			
			}
		
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"GET STARTED\")").click();
		
	}

}
