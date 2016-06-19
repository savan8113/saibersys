package com.test.corealm;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CorealmAssignment {
	
	@Test
	public static void loginTest()
	{	
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.solaborate.com/");
		
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("qasunil67@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Sunil@123");
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath(".//*[@id='postContent']")).sendKeys("Hi....!!!! This is Sunil");
		
		driver.findElement(By.xpath(".//*[@id='btnPostNewsfeed']")).click();
		
		driver.findElement(By.xpath(".//*[@id='aMess']")).click();
		
		driver.findElement(By.xpath(".//*[@id='chat_oneOnOne']/i")).click();
		
		driver.findElement(By.xpath(".//*[@id='ChatStatus_51428']")).click();
		
		driver.findElement(By.xpath(".//*[@id='msgContents_4a59c699-e727-4a03-8b7a-7ca2b8d803c5']/div[1]")).sendKeys("How are you?", Keys.ENTER);
		
		driver.findElement(By.xpath(".//*[@id='solaborateLogo']/a[1]/img")).click();
		
		driver.findElement(By.xpath(".//*[@id='mainNavigation']/ul[1]/li[3]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='userImageMasterSmall']")).click();
		
		driver.findElement(By.xpath(".//*[@id='lbLogout']")).click();
		
		
		
	}

}
