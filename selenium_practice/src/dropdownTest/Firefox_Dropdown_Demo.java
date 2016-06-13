package dropdownTest;



import java.util.ArrayList;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Firefox_Dropdown_Demo {
	@Test
	public void selectDDvalues() throws InterruptedException{
		
		WebDriver driver= new FirefoxDriver();

		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement month_dropdown= driver.findElement(By.id("month"));
		
		WebElement title= driver.findElement(By.className("fb_logo img sp_Vqgm9dN_P0N_2x sx_7df426"));
		
		WebElement submitButton= driver.findElement(By.xpath(".//*[@id='u_0_j']"));
		
	
			
//		Select monthdd= new Select(month_dropdown);
		
//		monthdd.selectByIndex(2);
//		
//		Thread.sleep(3000);
//		
//		monthdd.selectByValue("6");
//	
//		Thread.sleep(3000);
//		
//		monthdd.selectByVisibleText("Dec");
		
//		WebElement day_dropdown= driver.findElement(By.id("day"));
//		Select daydd=new Select(day_dropdown);
//		WebElement year_dropdown=driver.findElement(By.id("year"));
//		Select yeardd= new Select(year_dropdown);
//		
//		monthdd.selectByIndex(5);
//		daydd.selectByValue("13");;
//		yeardd.selectByVisibleText("2000");
		
//		System.out.println(monthdd.getFirstSelectedOption().getText());
//		
//		monthdd.selectByIndex(0);
		
		String str=driver.findElement(By.id("month")).getText();
		
		System.out.println(str);
//		
//		System.out.println(monthdd.getFirstSelectedOption().getText());
//		Assert.assertEquals("May", monthdd.getFirstSelectedOption().getText());
//		
		
		
//		List<WebElement> web_Month_List= monthdd.getOptions();
//		
//		List<String> actual_Month_List= new ArrayList(web_Month_List);
//		
//		
//		System.out.println(actual_Month_List);
//		List<String> expected_Month_List= new ArrayList();
//
//		expected_Month_List.add("Month");
//		expected_Month_List.add("Jan");
//		expected_Month_List.add("Feb");
//		expected_Month_List.add("Mar");
//		expected_Month_List.add("Apr");
//		expected_Month_List.add("May");
//		expected_Month_List.add("Jun");
//		expected_Month_List.add("Jul");
//		expected_Month_List.add("Aug");
//		expected_Month_List.add("Sept");
//		expected_Month_List.add("Oct");
//		expected_Month_List.add("Nov");
//		expected_Month_List.add("Dec");
//		
//		Assert.assertEquals(expected_Month_List, actual_Month_List);
//		//Assert.assertSame(expected_Month_List, actual_Month_List);
		
		driver.quit();
	}

	
}
