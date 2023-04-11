package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lcators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(null);
        WebElement allDepartament = driver.findElement(By.className(""));
        allDepartament.click();
        Thread.sleep(5000);
        WebElement allDivTags = driver.findElement(By.className("search_select"));
        WebElement allDepartment = null;
		allDepartment.click();
        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        
	}

}
