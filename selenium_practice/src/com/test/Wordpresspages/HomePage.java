package com.test.Wordpresspages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage {
	
	
	WebDriver driver;

	public HomePage() {
		super();
	}

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='menu-posts']/a/div[3]")
	@CacheLookup
	WebElement posts;
	
	@FindBy(how=How.XPATH, using=".//*[@id='wpbody-content']/div[3]/h1/a")
	@CacheLookup
	WebElement addNew;
	
	@FindBy(how=How.XPATH, using=".//*[@id='title']")
	@CacheLookup
	WebElement post_title;
	
//	@FindBy(id="mceu_34")
//	@CacheLookup
//	WebElement post_text;
	
	@FindBy(how=How.XPATH, using=".//*[@id='publish']")
	@CacheLookup
	WebElement publishButton;
	
	@FindBy(how=How.XPATH,using=".//*[@id='message']/p")
	@CacheLookup
	WebElement result;
	
	public void verifyAddPost(String postData, WebDriver driver1) throws InterruptedException
	{
		posts.click();
		
		addNew.click();
		
		post_title.sendKeys(postData, Keys.TAB);
		
		Thread.sleep(2000);
		WebElement currentElement= driver.switchTo().activeElement();
		System.out.println(currentElement.getTagName());
		currentElement.sendKeys(postData);
		
		Thread.sleep(2000);

		publishButton.click();
		
		Assert.assertTrue(result.getText().contains("Post published"));
		
		
		
		
	}
	

}
