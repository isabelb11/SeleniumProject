package selenium.basics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        
        String currentWindow = driver.getWindowHandle();
        WebElement element = driver.findElement(By.id("idValueoLink"));
        
	    Set <String> windowHandles =driver.getWindowHandles();
        Iterator <String> iterator = windowHandles.iterator();
        
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);
       
	}

        
}

