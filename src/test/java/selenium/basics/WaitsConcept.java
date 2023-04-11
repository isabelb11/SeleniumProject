package selenium.basics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		//explicitwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hamburgerBtn")));
		driver.findElement(By.id("hamburgerBtn")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("hamburgerBtn")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hamburgerBtn")));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		// fluent wait
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
                                         .withTimeout(Duration.ofSeconds(40))
                                         .pollingEvery(Duration.ofSeconds(5))
                                         .ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.elementToBeClickable(By.id("hamburgurgerBtn")));

		
		
	}

}
