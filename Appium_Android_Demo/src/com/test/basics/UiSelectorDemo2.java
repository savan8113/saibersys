package com.test.basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class UiSelectorDemo2 {

	@Test
	public void calculator() throws MalformedURLException
	{
		File app=new File("/Users/Savanth/Documents/workspace/AppiumDemo/apk/calculator.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,200);
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().index(0)").getText());
		
		driver.findElement(By.id("com.digitalchemy.calculator.freedecimal:id/n6")).click();
		
		driver.findElement(By.id("com.digitalchemy.calculator.freedecimal:id/multiply")).click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector().index(23)").click();
		
//		driver.findElement(By.id("com.digitalchemy.calculator.freedecimal:id/n2")).click();
		
		driver.findElement(By.id("com.digitalchemy.calculator.freedecimal:id/n3")).click();
		
		driver.findElement(By.id("com.digitalchemy.calculator.freedecimal:id/equals")).click();
		

		
	}
}
