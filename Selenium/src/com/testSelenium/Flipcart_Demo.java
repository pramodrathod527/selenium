package com.testSelenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement popup_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		popup_button.click();
		
		Thread.sleep(2000);
		
		WebElement main_searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		main_searchBox.sendKeys("laptop");
		
		main_searchBox.sendKeys(Keys.RETURN);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formate = new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss");
		
		Date date = new Date();
		
		String currentDate = formate.format(date);
		
		File dest = new File("F:\\ScreenshotBySelenium\\flipkartProduct"+currentDate+".jpeg");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
		
	

	}

}
