package selenium.intermediate;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		WebElement allIcon = driver.findElement(By.xpath("//button[@id='hamburgerBtn']"));
        allIcon.click();
        WebElement electronics = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
        electronics.click();
        WebElement videoGames = driver.findElement(By.xpath("//span[contains(text(),'Video Games')]"));
        videoGames.click();
        Thread.sleep(2000);
        List<WebElement> products = driver.findElements(By.tagName("img"));
        System.out.println(products.size() + " is size of this list or count of products");
        for(WebElement product:products) {
        	System.out.println(product.getAttribute("alt"));
        	if(product.getAttribute("alt").equals("NPET K10 Gaming keyboard")) {
        		product.click();
        		break;
        	}
        }
        		
        		System.out.println("Out of the loop ++++++++++++++++++++");       		
        	}
        
	}


