package selenium.intermediate;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/links");
		
		String originalWindow = driver.getWindowHandle();
		WebElement newTabWithHtmlLink = driver.findElement(By.xpath("//a[contains(text(),'html')]"));
		newTabWithHtmlLink.click();
		 
		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle:windowHandles) {
			if (!originalWindow.contentEquals(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		
		String htmlWindowTitle = driver.getTitle();
		System.out.println(htmlWindowTitle + " This is html window title");
		driver.close();
		driver.switchTo().window(originalWindow);
		Thread.sleep(5000);
		
		WebElement newTabWithJS = driver.findElement(By.xpath("//a[contains(text(),'js')]"));
		newTabWithJS.click();
		
		for(String handleTwo:driver.getWindowHandles()) {
			if(!originalWindow.contentEquals(handleTwo)) {
				driver.switchTo().window(handleTwo);
				break;
			}
		}
		String jslWindowTitle = driver.getTitle();
		System.out.println(jslWindowTitle + " This is JS window title");
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(originalWindow);
		Thread.sleep(5000);
		driver.quit();
		

	}



			}
		
		

	


