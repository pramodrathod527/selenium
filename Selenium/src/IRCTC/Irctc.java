package IRCTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Irctc {
	



	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Velocity Selenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		
//		ChromeOptions option = new ChromeOptions();
//		
//		option.addArguments("--disable-notifications");
//		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
//		WebElement loginButton = driver.findElement(By.xpath("//a[text()=' LOGIN ']"));
//		WebElement dishaBannerClose =driver.findElement(By.xpath("//img[@id='disha-banner-close']"));
//		WebElement registerButton = driver.findElement(By.xpath("//a[text()=' REGISTER ']"));
		WebElement userName	= driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement continueButton= driver.findElement(By.xpath("//button[text()='Continue ']"));
		WebElement firstName= driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement continueButton1= driver.findElement(By.xpath("//button[text()='Continue ']"));
		WebElement checkBox1= driver.findElement(By.xpath("//input[@id='sbi']/.."));
		WebElement checkBox2= driver.findElement(By.xpath("//input[@formcontrolname='termCondition']/.."));
		
//		loginButton.click();
//		dishaBannerClose.click();
//		
		userName.sendKeys("pramod");
		continueButton.click();
		firstName.sendKeys("pramod");
		continueButton1.click();
		checkBox1.click();
		checkBox2.click();
		
	}
		

}
