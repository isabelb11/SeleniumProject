package selenium.basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// open chrome browser 
		// go to tek retail application
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// in Selenium webdriver 3 this was how we define he wait
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// in selenium webdriver 4 this is how we define the wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		Thread.sleep(5000);
		WebElement signIn = driver.findElement(By.id("signinLink"));
		signIn.click();
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		// we need to check if this button is enabled
		System.out.println(loginButton.isEnabled() + " the status of login button");
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("transformers.test@tekschool.us"); // sendKeys send value into an input field 
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.clear();// .clear will remove value from the input field
		passwordField.sendKeys("Tek@12345");
		System.out.println(loginButton.isEnabled() + " the status of login button");
		loginButton.click();
	}

}






	


