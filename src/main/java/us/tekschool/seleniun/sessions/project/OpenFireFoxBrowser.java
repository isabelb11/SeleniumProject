package us.tekschool.seleniun.sessions.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenFireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver drive = new FirefoxDriver();
		//ChromeDriver.manage().window().maximize();
		//driver.get(url);
		
		
		

	}

}
