package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
  
 // WebDriverManager.firefoxdriver().setup();
  //WebDriver driver = new FirefoxDriver();
 // driver.get("https://tek-retail-ui.azurewebsites.net/");
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		//driver.get("https://tek-retail-ui.azurewebsites.net/");
		
		
 
	}

}
