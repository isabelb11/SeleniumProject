package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeConcept {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/iframe");
		// step 1. we need to get locator or id of i-frame 
		// step 2. we need to switchTo  i-frame 
	    // step 3. then we can perform action on targeted locator
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);
		String text =driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.id("title")).getText());
		
		
		





		
	}

}
