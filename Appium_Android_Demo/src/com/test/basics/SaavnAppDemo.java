package com.test.basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SaavnAppDemo {
	
	@Test
	public void testSaavn() throws MalformedURLException
	{
		
		File app=new File("/Users/Savanth/Documents/workspace/AppiumDemo/apk/saavn.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,500);
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"T E L U G U\")").click();
		
		driver.findElement(By.id("com.saavn.android:id/done")).click();
		
		driver.findElement(By.id("com.saavn.android:id/nextBtn")).click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"GOT IT\")").click();
		
		driver.findElementByAndroidUIAutomator("new UiSelector().description(\"UPDATE NOW Link\")").click();
		
		WebElement wElement = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"New Releases\")");
		
		TouchAction tAction = new TouchAction(driver);
		
		tAction.tap(wElement).perform();
		
		driver.scrollTo("Bichagadu");
		
		List<MobileElement> filmList= driver.findElementsByClassName("android.widget.TextView");
		
		for(MobileElement film: filmList)
		{
			if(film.getText().contains("Bichagadu"))
				tAction.tap(film).perform();
		}
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CALCULATOR);
		
	}

}
