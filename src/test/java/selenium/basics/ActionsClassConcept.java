package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/drag-drop");
		// drag and drop using Actions class
		// step 1. we need to find the locator of Source element
		// step 2. we need to find the locator of target element
		// step 3. we need to create Object of Actions
		// step 4. we will use draganddrop method
		Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.xpath("//*[contains(text(),'Payment should not accept')] "));
		WebElement target = driver.findElement(By.xpath("(//div[contains(@class,'w-60')])[2]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		Thread.sleep(5000);
		
		WebElement SourceTwo = driver.findElement(By.xpath("//div[contains(text(),'After Item is removed from cart')]"));
		WebElement targetTwo = driver.findElement(By.xpath("(//div[contains(@class,'w-60')])[3]"));
		new Actions(driver).dragAndDrop(source, targetTwo).perform();
	}
}




	
