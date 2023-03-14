package com.testSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		WebElement input_id = driver.findElement(By.xpath("//input[@name='cusid']"));
		
		input_id.sendKeys("1234");
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		
		submit.click();
		
		
		Alert alt = driver.switchTo().alert();
		
		String str = alt.getText();
		
		System.out.println(str);
		
		
		
		alt.accept();
		Thread.sleep(2000);
		String str1 = alt.getText();
		System.out.println(str1);
		alt.accept();
		
		driver.close();
		
		
		
		Thread.sleep(2000);
		
//		driver.close();
		

	}

}
