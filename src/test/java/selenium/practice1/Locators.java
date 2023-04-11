package selenium.practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passField = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginBtn']"));
		emailField.sendKeys("isabel.blas@tekschool.us");// write your own username
		passField.sendKeys("tek@12345"); // write your own pass
		loginButton.click();
		
		
		
		
		WebElement allDepartmentsDropDown = driver.findElement(By.id("search"));
        Select select = new Select(allDepartmentsDropDown);
        select.selectByVisibleText("Computers");
        Thread.sleep(8000);
        WebElement searchBar = driver.findElement(By.id("searchInput"));
        searchBar.sendKeys("Amazon eero mesh Wifi routen");
        Thread.sleep(8000);
        WebElement searchButton = driver.findElement(By.xpath("//button[@class='search__btn']"));
        searchButton.click();
        Thread.sleep(8000);
        WebElement productWifiRouter = driver.findElement(By.xpath("//img[@alt='Amazon eero mesh WiFi router']"));
        productWifiRouter.click();
        Thread.sleep(8000);
        WebElement quantityDropdown = driver.findElement(By.xpath("//select[@class='product__select']"));
        Select selectQty = new Select(quantityDropdown);
        selectQty.selectByValue("5");
		
	    
}
}
