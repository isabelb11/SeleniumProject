package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChromeBrowser {
 public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    // this line of the code will maximize the window 
	    driver.manage().window().maximize();
	    // .get(url); open application 
	    driver.get("https://tek-retail-ui.azurewebsites.net/");
	    // .getTitle() : Return a String
	    String title = driver.getTitle();
	    System.out.println(" The title of this page is " + title);
	    Thread.sleep(5000);
	    driver.navigate().to("https://tekschool.us/");
	    Thread.sleep(5000);
	    String titleOf2ndPage = driver.getTitle();
	    System.out.println(" The title of this page is " + titleOf2ndPage);
	    driver.navigate().refresh(); // this will refresh the same page
	    driver.navigate().back(); // this will move us to retail application
	    //driver.navigate().forward(); // this will mvoe us to tekschool application
	    //.close(); close the browser which opened by webdriver
	    //.quit(); closes all the tabs opened by webdriver
	    //driver.close();
		
		

	}

}
