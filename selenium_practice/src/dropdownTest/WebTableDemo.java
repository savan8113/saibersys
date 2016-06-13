package dropdownTest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.southwest.com/");
		
		JavascriptExecutor je= (JavascriptExecutor) driver;
		
		je.executeScript("scroll(0,400)");
		
		driver.findElement(By.xpath("//input[@id='air-date-departure']")).click();
		
		List<WebElement> dateList= driver.findElements(By.xpath("//table[@class='calendar-table']"));
				
		System.out.println(dateList.size());
		for(int i=0; i<dateList.size();i++)
		{
			
			System.out.println(dateList.get(i));
//			if (dateList.get(i).getText().equals(30))
//			{
//				System.out.println(dateList.get(i).getText());
//				dateList.get(i).click();
//				break;
//			}
		}
		
	}

}
