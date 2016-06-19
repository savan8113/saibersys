package com.test.basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class UIOperationsDemo {

	
	@Test
	public void bookMyShowUIOperations() throws MalformedURLException, Exception
	{
		File app=new File("/Users/Savanth/Documents/workspace/AppiumDemo/apk/BookMyShow.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,200);
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
//		List<MobileElement> buttons= driver.findElementsByClassName("android.widget.Button");
//		
//		buttons.get(1).click();
		
		driver.findElementById("btnNoThanks").click();
		
//		driver.findElementById("com.bt.bms:id/dismiss").click();
		
		MobileElement city= driver.findElementByClassName("android.widget.CheckedTextView");
		
		System.out.println(city.getText());
		
//		city.swipe(SwipeElementDirection.UP, 19000);
		
		driver.zoom(city);

		TouchAction tAction= new TouchAction(driver);
		
		tAction.tap(city).perform();
		
		
		
		
		
		
	}
}
