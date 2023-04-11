package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().deleteAllCookies();
	    driver.get("https://tek-retail-ui.azurewebsites.net/");
	    Thread.sleep(5000); // hard stop
	    driver.navigate().to("https://tekschool.us/");
	    Thread.sleep(5000);
	    driver.navigate().back();
	    Thread.sleep(5000);
	    driver.navigate().forward();
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	    Thread.sleep(5000);
	    driver.close();
	    driver.quit();
	    
	}
	
	

	
	}


