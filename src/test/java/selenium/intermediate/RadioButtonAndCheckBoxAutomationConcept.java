package selenium.intermediate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonAndCheckBoxAutomationConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium/checkbox");
		
		Thread.sleep(5000);
        WebElement JavaCheckBox = driver.findElement(By.id("javaInput"));
        System.out.println(JavaCheckBox.isSelected() + " before selecting the checkbox");
        if(!JavaCheckBox.isSelected()) {
            JavaCheckBox.click();
        }
        System.out.println(JavaCheckBox.isSelected() + "after selecting the checkbox");
        WebElement radioButtonLink = driver.findElement(By.linkText("Radio Button"));
        radioButtonLink.click();
        Thread.sleep(5000);
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println(radioButtons.size() + " This is the size of list ");
        for(WebElement button:radioButtons ) {
            if(button.getAttribute("value").equals("JavaScript")) {
                if(!button.isSelected()) {
                    button.click();
                    break;
                }
            }
        }
    }
		
	}


