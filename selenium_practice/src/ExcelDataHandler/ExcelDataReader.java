package ExcelDataHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelDataReader {
	
	
	static WebDriver driver;
	
	
	public static void main(String args[]) throws Exception
	{
		
		File file= new File("/Users/Savanth/Desktop/selenium.xlsx");
		
		FileInputStream fis= new FileInputStream(file);
		
		Workbook workbook=  WorkbookFactory.create(fis);
		
		Sheet sheet1= workbook.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Result");
		
		for(int i=1; i<sheet1.getLastRowNum()+1; i++)
			{
			
			driver= new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
			
			driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(sheet1.getRow(i).getCell(0).getStringCellValue(), Keys.TAB);
			
			driver.switchTo().activeElement().click();
			
			Thread.sleep(500);
			
			if (driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).isDisplayed())
				{
					sheet1.getRow(i).createCell(2).setCellValue("Invaid Email address");
					
					driver.quit();
					
					continue;
				}
			
			else
				{
				
				driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(sheet1.getRow(i).getCell(1).getStringCellValue(), Keys.TAB);
				
				driver.switchTo().activeElement().click();
				
				if( driver.getTitle().contains("Inbox"))
					
					sheet1.getRow(i).createCell(2).setCellValue("Succesfully Logged In");
				
				else
				{
					sheet1.getRow(i).createCell(2).setCellValue("Invaid Password");
					
					driver.quit();
					
					continue;
				}
					
					
				
				}
			
			
		
			
	//		driver.get("https://mydemosite8113.wordpress.com/wp-login.php");
	//		
	//		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(sheet1.getRow(i).getCell(0).getStringCellValue());
	//		
	//		Thread.sleep(1000);
	//		
	//		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(sheet1.getRow(i).getCell(1).getStringCellValue());
	//		
	//		Thread.sleep(1000);
	//		
	//		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
	//		
	//		Thread.sleep(1000);
	//		
	//		if(driver.getTitle().contains("Dashboard"))
	//			{
	//				sheet1.getRow(i).createCell(2).setCellValue("Success");
	//				
	//			}
	//		else
	//		{
	//				sheet1.getRow(i).createCell(2).setCellValue("Fail");
	//				
	//		}
	//		
			driver.close();
			
			}
		
		FileOutputStream fos= new FileOutputStream(file);
		
		workbook.write(fos);
		
		workbook.close();
		
	}
	


}
