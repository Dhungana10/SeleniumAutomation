package SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumBajaj {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/kshitizdhungana/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement p = driver.findElement(By.name("q"));
		p.sendKeys("Bajaj Finserv Health" +Keys.ENTER);
		
		driver.findElement(By.xpath("//h3[text()='Bajaj Finserv Health - Your Personalized Healthcare Platform']")).click();
		
	    driver.findElement(By.xpath("//INPUT[@id='searchBarInput']")).sendKeys("Doctor"+Keys.ENTER);
	    
	    driver.findElement(By.xpath("(//DIV[@class='css-14hwr1e'])[1]")).findElement(By.xpath("(//H3[@class='css-1j5o23t'][text()='Book Appointment'])[1]")).click();
//	    
		p.submit();

	}

}