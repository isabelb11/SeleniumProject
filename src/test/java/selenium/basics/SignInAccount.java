package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement signIn =driver.findElement(By.xpath("//a[@id='signinLink']"));
		signIn.click();
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passField = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		emailField.sendKeys("isabel.blas@tekschool.us");// write your own username
		passField.sendKeys("tek@12345"); // write your own pass
		loginButton.click();
		WebElement accountButton = driver.findElement(By.xpath("//a[@id='accountLink']"));
		accountButton.click();
		WebElement cardNumber = driver.findElement(By.xpath("//input[@id='cardNumberInput']"));
		WebElement nameOnTheCard = driver.findElement(By.xpath("//input[@id='nameOnCardInput']"));
		WebElement expMonth = driver.findElement(By.xpath("//select[@id='expirationMonthInput']"));
		WebElement expYear = driver.findElement(By.xpath("//select[@id='expirationYearInput']"));
		WebElement securityCode = driver.findElement(By.xpath("//input[@id='securityCodeInput']"));
		WebElement addYourCardButton = driver.findElement(By.xpath("//button[@id='paymentSubmitBtn']"));
		cardNumber.sendKeys("2587413699789654");
		nameOnTheCard.sendKeys("Transformers");
		Select selectMonth = new Select(expMonth);
		selectMonth.selectByVisibleText("5");
		Select selectYear = new Select(expYear);
		selectYear.selectByValue("2025");
		securityCode.sendKeys("123");
		addYourCardButton.click();
		Thread.sleep(2000);
		
		WebElement successMessage = driver.findElement(By.xpath("//div[text()='Payment Method added sucessfully']"));
		System.out.println(successMessage.isDisplayed());
	}

}
