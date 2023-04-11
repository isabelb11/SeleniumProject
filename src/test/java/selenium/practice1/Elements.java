package selenium.practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		//driver.close();
		//driver.quit();
		//driver.findElement(By.name("q")).sendKeys("abcd");
		//Thread.sleep(3000);
		//driver.quit();
		
		WebElement textBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		textBox.sendKeys("Automation step by step");
		
		Thread.sleep(3000);
		//driver.quit();
	}

}
