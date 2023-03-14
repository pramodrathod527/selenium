package com.testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_SignUp {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		
		
		
		driver.close();
		

	}

}
