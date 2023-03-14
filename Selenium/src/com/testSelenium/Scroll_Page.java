package com.testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Page {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement popup_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		popup_button.click();	
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//way 1st: by px;
		js.executeScript("window.scrollBy(0,1030)","");
		
		// way 2: upto webElement;
		
		Thread.sleep(2000);
		
		
//		WebElement pro = driver.findElement(By.xpath("//div[text()='Havan Items']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();", pro);

	}

}
