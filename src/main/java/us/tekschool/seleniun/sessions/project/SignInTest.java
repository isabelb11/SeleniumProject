package us.tekschool.seleniun.sessions.project;

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
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    // driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.get("https://tek-retail-ui.azurewebsites.net/");
        Thread.sleep(5000);
        WebElement signIn = driver.findElement(By.id("signinLink"));
        signIn.click();
        WebElement emailField = driver.findElement(By.id("email"));
       // WebElement emailField;
		emailField.sendKeys("isabel.blas@tekschool.us");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys("");
        WebElement loginButton = driver.findElement(By.id("loginBtn"));
        loginButton.click();
        
        
   
        
        
        

	}

}
