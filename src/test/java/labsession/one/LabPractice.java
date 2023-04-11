package labsession.one;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement signIn = driver.findElement(By.linkText("Sign in"));
		signIn.click();
		Thread.sleep(2000);
		WebElement wantToSellSomethingLink = driver.findElement(By.xpath("//a[@class='login__company-btn']"));
		wantToSellSomethingLink.click();
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("transformers.sellers@tek.com");
		WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
		passwordField.sendKeys("Tek@12345");
		WebElement companyName = driver.findElement(By.id("nameInput"));
		companyName.sendKeys("TEK");
		WebElement description = driver.findElement(By.tagName("textarea"));
		description.sendKeys("This is selling account by Tek");
		WebElement url = driver.findElement(By.id("urlInput"));
		url.sendKeys("tekschool.us");
		Thread.sleep(5000);
		WebElement createAccountButton = driver.findElement(By.xpath("//button[text()='Create Account']"));
		createAccountButton.click();
		Thread.sleep(5000);
		driver.close();

	}
}

