package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrime.driver","C://chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://tek-retail-ui.azurewebsites.net/auth/login");
	    WebElement email = driver.findElement(By.id("email"));
	    WebElement password = driver.findElement(By.name("password"));
	    WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginBtn']"));
	    WebElement radioButton = driver.findElement(By.id("radioButton"));
	    email.sendKeys("value of password");
	    password.clear();
	    password.sendKeys("value of password");
	    loginButton.isDisplayed();// RETUNR A BOOLEAN TRUE/FALSE.
	    loginButton.isEnabled(); // RETURN A BOOLEAN VALUE TRUE/FALSE.
	    loginButton.click(); //RETURN IS VOID
	    radioButton.isDisplayed(); // RETURN A BOOLEAN TRUE/FALSE.
	    email.getText(); // return a string
	    email.getTagName(); // return tagName of element- string
	    email.getAttribute("id");
	    
	}

}
