package selenium.practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	private static WebElement allDepartmentsDropDown;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		WebElement signIn = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		signIn.click();
		WebElement emailField = driver.findElement(By.xpath("//input[@id='ap_email']"));
	    emailField.sendKeys("hannerisabel1@gmail.com");	
	    WebElement continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
	    continue1.click();
	    WebElement passwordField = driver.findElement(By.xpath("//input[@id='ap_password']"));
	    passwordField.sendKeys("Matthew11");
	    WebElement signIn2 = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	    signIn2.click();
	    
	    WebElement allDepartamentDropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	    allDepartamentDropDown.click();
	    WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
	    searchBar.sendKeys("iphone 14 pro max phone");
	    searchBar.click();
	    WebElement iphone14 = driver.findElement(By.xpath("//img[@alt='Apple iPhone 14 Pro Max, 256GB, Deep Purple - Unlocked (Renewed)']"));
	    click();
	    WebElement SearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    click();
	    
	    
	    
	    
	    
		
		
}

	private static void click() {
		// TODO Auto-generated method stub
		
	}
}
