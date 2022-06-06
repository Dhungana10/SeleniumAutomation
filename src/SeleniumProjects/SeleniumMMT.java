package SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumMMT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/kshitizdhungana/Downloads/chromedriver");
	    
//		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
	    options.addArguments("--disable-web-security");
	    options.addArguments("--disable-blink-features=AutomationControlled");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		
		WebElement login = driver.findElement(By.xpath("//LI[@data-cy='account']"));
		login.click();
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("dhungana.kd99@gmail.com");
		
//		WebDriverWait wait = new WebDriverWait(_driver, 10);
//		Thread.sleep(2000);
		WebElement con = driver.findElement(By.xpath("//button[@class='capText font16']"));
		Thread.sleep(5000);
		con.click();
	} 

}
