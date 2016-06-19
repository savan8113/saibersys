package com.test.basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class OpenApp {
	
	@Test
	public void bookMyShowHome() throws MalformedURLException
	{
		
//		File source= new File("src");
//		
		File app=new File("/Users/Savanth/Documents/workspace/AppiumDemo/apk/BookMyShow.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200);
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
//		WebDriverWait wait= new WebDriverWait(driver, 20);
//		
//		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id("com.bt.bms:id/btnLogin"))));
//		
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		
		driver.findElementById("com.bt.bms:id/signUp").click();
		
		List<MobileElement> signupElements=driver.findElementsByClassName("android.widget.EditText");
		
		System.out.println(signupElements.size());
		
		signupElements.get(0).sendKeys("saibersys");
		
		signupElements.get(1).sendKeys("12345");
		
		signupElements.get(2).sendKeys("saibersys@mymail.com");
		
		signupElements.get(3).sendKeys("saibersys12345");
		
		signupElements.get(4).sendKeys("1234567890");
		
		driver.findElement(By.id("com.bt.bms:id/action_icon")).click();
		
		
	}

}
