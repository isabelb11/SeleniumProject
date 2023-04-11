package selenium.practice1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Truliant {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.truliantfcu.org/");
		Thread.sleep(5000);
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='userid']"));
		usernameField.sendKeys("Isabel19");
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='userPwd']"));
		passwordField.sendKeys("Emiliano30");
		WebElement loginButton = driver.findElement(By.xpath("//button[@value='Login Now']"));
		loginButton.click();
		
		
}
}
