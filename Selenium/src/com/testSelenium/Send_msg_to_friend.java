package com.testSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Send_msg_to_friend {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		
		username.sendKeys("pramodrathod527@gmail.com");
		password.sendKeys("rowdy@9168");
		button.sendKeys(Keys.RETURN);
		
		Thread.sleep(3000);
		
		WebElement friends = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/friends/']"));
		
		//span[text()='All Friends']
		
		friends.click();
		
		
		WebElement friend_container = driver.findElements(By.xpath("// div[@class='xsag5q8']")).get(0);
		
		List<WebElement> friend_list =  friend_container.findElements(By.xpath("/div/div"));
		
		
		
		
		
		
		
		
		

	}

}
