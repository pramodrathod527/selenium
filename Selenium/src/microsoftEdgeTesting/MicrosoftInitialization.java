package microsoftEdgeTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftInitialization {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:\\Velocity Selenium\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");

	}

}
