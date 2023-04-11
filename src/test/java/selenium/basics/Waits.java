package selenium.basics;



import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//explicit wait:
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
		explicitWait.until(ExpectedConditions.elementToBeSelected(By.id("select")));
		
		//fluent Wait
		Wait <WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(25))
				.pollingEvery(Duration.ofSeconds(5));
		fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));	
		
		
			

}
	
}
