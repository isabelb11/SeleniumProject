package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// by.id
		// by.class
		// by.name 
		// by.linktext
		// by.partialLinkText
		// by.tagname
		// by.CssSelector
		// by.Xpath
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("value"));
		driver.findElement(By.className("value"));
         driver.findElement(By.name("value"));
         driver.findElement(By.linkText(""));
         driver.findElement(By.partialLinkText(""));
         driver.findElement(By.cssSelector(""));
         driver.findElement(By.xpath(""));

}
}