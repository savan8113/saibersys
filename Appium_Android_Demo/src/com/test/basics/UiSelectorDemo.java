package com.test.basics;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class UiSelectorDemo {

	@SuppressWarnings("deprecation")
	@Test
	public void getCityCount() throws MalformedURLException
	{
		File app=new File("/Users/Savanth/Documents/workspace/AppiumDemo/apk/BookMyShow.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,200);
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"I'LL SKIP\")").click();
		
		List<MobileElement> citiesList=driver.findElementsByAndroidUIAutomator("new UiSelector().checkable(true)");
		
		System.out.println(citiesList.size());
		
	}
}
