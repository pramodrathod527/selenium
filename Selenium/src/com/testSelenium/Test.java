package com.testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
//		
//		Thread.sleep(3000);
		
//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().to("https://www.facebook.com/Outlookindia");
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().to("https://www.javatpoint.com/how-to-take-array-input-in-java");
		
//		driver.manage().window().maximize();
		
//		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
		
		
		driver.get("https://www.instagram.com/accounts/login/");
		
//		Thread.sleep(3000);
		
		WebElement user_id = driver.findElement(By.xpath("//input[@name='username']"));
		
		user_id.sendKeys("pramod123");
		
	
		
	}

}
