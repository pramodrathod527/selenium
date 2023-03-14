package fireFoxTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInitialization {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver","E:\\Velocity Selenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	}

}
