package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenFirefoxBrowser {
	static String url1 = "https://google.com/";
	static String url = "https://tek-retail-ui.azurewebsites.net/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		// Syntax WebDriverManager.browserType.setup();
		WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.gecko.browser","C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url1);
	}

}
