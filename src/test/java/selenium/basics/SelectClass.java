package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/auth/loging");
		WebElement element = driver.findElement(By.xpath("//select[@id='select']"));
		Select select = new Select(element);
		select.selectByIndex(0);
		select.selectByValue("1");
		select.selectByVisibleText("Computers");
		select.deselectByVisibleText("Computers");

	}

}
