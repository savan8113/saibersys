package com.test.webapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class UdemyTest {

	
	@Test
	public void getSoapUiClasses() throws MalformedURLException
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,1000);
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.get("https://www.udemy.com/");
		
		driver.findElement(By.xpath(".//*[@id='udemy']/div[2]/div[1]/div[2]/div[2]/form/div/input")).sendKeys("SOAPUI", Keys.ENTER);
		
		driver.findElement(By.xpath(".//*[@id='courses']/li[1]/a/div[2]/div[1]/div/span")).click();
		
		
		
	}
}
