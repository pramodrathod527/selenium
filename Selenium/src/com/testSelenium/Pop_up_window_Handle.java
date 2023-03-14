package com.testSelenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up_window_Handle {

	private static final int ArrayList = 0;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
		WebElement click_button = driver.findElement(By.xpath("//a[@target='_blank']"));
		
		click_button.click();
		
		ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
		int size = list.size();  
		
		for(int i=0;i<=size;i++) {
			String main = list.get(0);
			if(main == list.get(i)) {
				continue;
			}else {
				String child = list.get(i);
				driver.switchTo().window(child);
				WebElement mail_textbox = driver.findElement(By.xpath("//input[@name='emailid']"));
				mail_textbox.sendKeys("pramod123@gmail.com");
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
