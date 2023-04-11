package selenium.practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class BookFlights {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.aa.com/");
       
		
		WebElement oneWayRadioButton = driver.findElement
				(By.xpath("(//span[@class='control'])[3]"));
		if(!oneWayRadioButton.isSelected()) {
			oneWayRadioButton.click();
		}
		WebElement departure = driver.findElement
				(By.xpath("(//input[contains(@name,'origin')])[1]"));
		}
		//WebElement departure = driver.findElement(By.xpath("//input[@type='text']"));
		
		//departure.clear();
		//departure.sendKeys("Lim");
		//List<WebElement> depCity = driver.findElements(By.xpath("//a[@id='ui-id-25']"));
	
		//for(WebElement city:depCity) {
			//if(city.getText().contentEquals("LIM-Lima Jorge Chavez Internacional, Peru")) {
				//JavascriptExecutor js = ((JavascriptExecutor) driver);
				//js.executeScript("arguments[0].click();", city);
		}
	


	
  


