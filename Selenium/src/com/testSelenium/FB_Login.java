package com.testSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Login {
	
	
	public static void select_all(WebElement sel) throws InterruptedException {
		
		Select s = new Select(sel);
		
		int no_of_options = s.getOptions().size()-1;
		
		for(int i=0;i<=no_of_options;i++) {
			s.selectByIndex(i);
		}
		
		Thread.sleep(2000);
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
//		
//		WebElement first_textbox = driver.findElement(By.xpath("//input[@name='firstname']"));
//		WebElement last_textbox = driver.findElement(By.xpath("//input[@name='lastname']"));
//		WebElement mbl_or_email_textbox = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		WebElement password_text = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//		WebElement birth_day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		WebElement birth_month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		WebElement birth_year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//		WebElement gender = driver.findElement(By.xpath("//span[@data-name='gender_wrapper']"));
//		WebElement submit_button = driver.findElement(By.xpath("//button[@name='websubmit']"));
//		
//
//		first_textbox.sendKeys("Pramod");
//		
//		last_textbox.sendKeys("Rathod");
//		
//		mbl_or_email_textbox.sendKeys("9168729713");
//		
//		password_text.sendKeys("pramod234");
//		
////		select_all(birth_day);
////		select_all(birth_month);
////		select_all(birth_year);
//
//		
//		List<WebElement> gender_list = gender.findElements(By.tagName("span"));
//		
//		for(int i=0;i<gender_list.size();i++) {
//			
//			WebElement input_button = gender_list.get(i);
//			
//			if(i==2) {
//				continue;
//			}else {
//				input_button.click();
//			}
//			
//			
//			Thread.sleep(2000);
//		}
//		
//		submit_button.click();
		
		WebElement forgetText = driver.findElement(By.xpath("//form[@id=\"identify_yourself_flow\"]/div/div[2]/div/table/tbody/tr/td[2]/div"));
		
		String msg = forgetText.getText();
		
		System.out.println(msg);
		
	
		
		
		
		
		
		
		
		


	}

}
