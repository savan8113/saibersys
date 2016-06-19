package com.test.webapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppiumWebAppDemo {
	
	@Test
	public void basics() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,1000);
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
//		Thread.sleep(9000);
//		
		
		driver.get("http://m.cricbuzz.com");
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='top']/div[1]/div[5]/a[1]/div/div/div/span[2]")).getText());
//		
//		Thread.sleep(9000);
		
	}

}
