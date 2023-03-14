package com.rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chrome_driver_version110\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		Thread.sleep(2000);

		username.sendKeys("pramod");
		password.sendKeys("1234");
		
//		password.
//		loginButton.click();
		
		
		
		
		

	}

}
