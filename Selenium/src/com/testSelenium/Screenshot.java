package com.testSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement name_textBox = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		WebElement fullName_textBox = driver.findElement(By.xpath("//input[@name='fullName']"));
		WebElement userName_textBox = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		
		
		
		name_textBox.sendKeys("pramod");
		fullName_textBox.sendKeys("pramod Rathod");
		userName_textBox.sendKeys("er_pramod_rathod");
		password.sendKeys("pramod123");
		
		
		for(double i=0;i<=3;i++) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File src =ts.getScreenshotAs(OutputType.FILE);
			
			SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss");
			Date date = new Date();  
			String current_date = form.format(date);
			double j = Math.random();
			
			File dest = new File("F:\\ScreenshotBySelenium\\test"+current_date+".jpeg");
			
			FileHandler.copy(src, dest);
			
			Thread.sleep(2000);
			
		}
		
		
		
		
		
		
//		
//		 SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss");
//		 Date date = new Date();  
//		 String current_date = form.format(date);
//		
//		
		
		
		
		

		

//		String path = "C:\\Users\\C zone\\Documents\\Book3.xlsx";
//		
//		FileInputStream file = new FileInputStream(path);
//		
//		String value = WorkbookFactory.create(file).getSheet("velocity1").getRow(8).getCell(1).getStringCellValue(); 
//		
//		 System.out.println(value);  
//
	}

}
