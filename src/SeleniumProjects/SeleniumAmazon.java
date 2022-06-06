package SeleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/kshitizdhungana/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//A[@id='nav-link-accountList']")).click();
		
		WebElement emailOrPhone = driver.findElement(By.id("ap_email"));
		emailOrPhone.sendKeys("9863180291"+Keys.ENTER);
		
		WebElement enterPassword = driver.findElement(By.id("ap_password"));
		enterPassword.sendKeys("Falcom@00"+Keys.ENTER);
		
//		driver.findElement(By.id("signInSubmit")).submit();
		Thread.sleep(2000);
		WebElement searchDrop_Down = driver.findElement(By.xpath("//SELECT[@id='searchDropdownBox']"));
//		WebDriverWait(driver, 20).until(EC.element_to_be_clickable(By.xpath());
		Select sel = new Select(searchDrop_Down);
		sel.selectByVisibleText("Electronics");
		
		WebElement search_bar = driver.findElement(By.xpath("//INPUT[@id='twotabsearchtextbox']"));
		search_bar.sendKeys("Iphone 12"+Keys.ENTER);
//		
		driver.findElement(By.linkText("Apple iPhone 12 (128GB) - Blue")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		
	}

}
