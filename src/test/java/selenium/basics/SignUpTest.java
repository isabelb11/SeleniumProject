package selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SignUpTest {
    public static void main(String[] args) {
    	String browserName = "Chrome";
        String url = "https://tek-retail-ui.azurewebsites.net/";
        WebDriver driver = null;
        String name = "transformers";
        String email = "isabel.blas@tekschool.us";
        String password = "tek@12345";
        if(browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            
    }
        driver.manage().window().maximize();
        driver.get(url);
        WebElement signIn = driver.findElement(By.id("signinLink"));
        signIn.click();
        WebElement createNewAccountBtn = driver.findElement(By.id("newAccountBtn"));
        createNewAccountBtn.click();
        WebElement nameInput = driver.findElement(By.id("nameInput"));
        WebElement emailInput = driver.findElement(By.id("emailInput"));
        WebElement passwordInput = driver.findElement(By.id("passwordInput"));
        WebElement confirmPasswordInput = driver.findElement(By.id("confirmPasswordInput"));
        WebElement signupBtn = driver.findElement(By.id("signupBtn"));
        System.out.println(nameInput.isDisplayed()); // this method checks if element is present in ui or not
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);
        signupBtn.click();



}
}
