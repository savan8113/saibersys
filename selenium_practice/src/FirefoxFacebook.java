


import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxFacebook {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.facebook.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFirefoxFacebook() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("sa@gmail.com");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("jdnodsnv");
    driver.findElement(By.id("u_0_y")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

public boolean isAcceptNextAlert() {
	return acceptNextAlert;
}

public void setAcceptNextAlert(boolean acceptNextAlert) {
	this.acceptNextAlert = acceptNextAlert;
}
}
