package dropdownTest;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class certificateDemo {
	
	@Test
	public void selectDDvalues() throws InterruptedException{
		
//		DesiredCapabilities capabilities= new DesiredCapabilities();
//		
//		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/docs/02_selenium_ide.jsp#editing");
		driver.manage().window().maximize();
		
	
//		((JavascriptExecutor)driver).executeScript("scroll(0,4000)");
		String actual_Source=driver.getPageSource();
		String expected_Title="SeleniumHQ";
		
		Assert.assertTrue(actual_Source.contains(expected_Title));
		
	}

	
}
