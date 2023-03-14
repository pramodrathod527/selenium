package com.excelsheet;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Velocity Selenium\\chrome_driver_version110\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement dragElement = driver.findElement(By.xpath("//h5[text()='High Tatras 3']/.."));
		WebElement dropElement = driver.findElement(By.xpath("//div[@id='trash']"));
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(dragElement, dropElement).build().perform();
	}

}
