package com.testSelenium;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;


public class MauseActions_And_DynamicWebElement {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			WebElement popup_button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			
			popup_button.click();	
			
			//WebElement login_Button = driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
		
			//Task1: we will use mouse only
			
//			Actions act = new Actions(driver);
//			
//			act.moveToElement(login_Button).perform();
//			
//			WebElement order_cart = driver.findElement(By.xpath("//div[text()='Orders']"));
//			
//			act.moveToElement(order_cart).click().build().perform();
//			
//			Thread.sleep(2000);
//			
//			WebElement login_textbox = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//			
//			login_textbox.sendKeys("9168729713");
			
//			//task2: Go to the searchbox , sendkeys , check brand button;
//			WebElement main_searchBox = driver.findElement(By.xpath("//input[@name='q']"));
//			main_searchBox.sendKeys("laptop");
//			
//			// keys board key uses by following method
//			main_searchBox.sendKeys(Keys.RETURN);
//			
//			Thread.sleep(4000);
//			WebElement brandTab = driver.findElement(By.xpath("//div[text() = 'Brand']"));
//			
//			Thread.sleep(2000);
//			
//			
//			
	//
//			if (!brandTab.isDisplayed())
//			{
//				brandTab.click();
//			}
//			else {
//				
//				System.out.println("Brand tab is selected");
//			}
//			
//			Thread.sleep(2000);
//			
//			
//			List<WebElement> brand = driver.findElements(By.xpath("//div[@class='_4921Z t0pPfW']"));
//			
//			int no_of_brand = brand.size();
//			
//			System.out.println("total brand= "+no_of_brand);
//			
//			for(int i=0;i<=no_of_brand;i++) {
//				if(!brand.get(i).isSelected()) {
//					brand.get(i).click();
//				}
//				Thread.sleep(2000);
//				driver.navigate().back();
//				Thread.sleep(3000);
//			}
//			
			
//			
//			Actions act = new Actions(driver);
//			
//			Thread.sleep(2000);
//			
//			WebElement relivance = driver.findElement(By.xpath("//div[text()='Relevance']"));
//			WebElement popularity = driver.findElement(By.xpath("//div[text()='Popularity']"));
//			WebElement price_Low_to_high = driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
//			WebElement price_high_to_low = driver.findElement(By.xpath("//div[text()='Price -- High to Low']"));
//			WebElement newest_first = driver.findElement(By.xpath("//div[text()='Newest First']"));	
//			
//			ArrayList<WebElement> arr = new ArrayList<>();
//			arr.add(relivance);
//			arr.add(popularity);
//			arr.add(price_Low_to_high);
//			arr.add(price_high_to_low);
//			arr.add(newest_first);
//			
//			for(int i=0;i<arr.size();i++){
//				arr.get(i).click();
//			}
//			
//			Thread.sleep(2000);
//			List<WebElement> product_list = driver.findElements(By.xpath("//div[@class='_2kHMtA']"));
//			
////			int list = product_list.size();
//			
//			
//			product_list.get(1).click();
//			
			
//			for(int i=0;i<=list;i++) {
//				mobile_list.get(i).click();
//				driver.switchTo().defaultContent();
//				Thread.sleep(2000);
//				
//			}
			
			
			
			
			
			
			
			
			
			
		}

	}





