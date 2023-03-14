package com.flipkart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_functionality {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement popup_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		popup_button.click();
		
		Thread.sleep(2000);
		
		
		
		Actions act = new Actions(driver);
		
		WebElement login_button = driver.findElement(By.xpath("//a[text()='Login']"));
		
		
		act.moveToElement(login_button).click(login_button).perform();
		
		Thread.sleep(2000);
		 WebElement mail_input = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		 
		 mail_input.sendKeys("9168729713");
		 
		 
		 
		
		
		
	}

}
