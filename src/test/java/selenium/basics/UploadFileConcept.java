package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/upload");
		Thread.sleep(5000);
		// steps to upload a file or picture
				// step 1: we need to get the path where file is located with .extension type 
				// step 2: we need to get locator or address of element where we upload the file 
				// step 3: In Selenium we can use .sendKeys method and inside the argument we will
				// pass the path to the file and this will upload the file into browser.
		String pathtoFile = "C:\\Users\\teksc\\Downloads\\image.jpg";
		//String pathtoFile = "Users/teksc/Downloads/image.jpg"; -- mac users
		WebElement uploadFile = driver.findElement(By.cssSelector("#fileInput"));
		uploadFile.sendKeys(pathtoFile);
		
		
	
	
}
}

	