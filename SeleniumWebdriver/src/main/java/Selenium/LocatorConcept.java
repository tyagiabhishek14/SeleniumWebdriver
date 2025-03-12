package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("header[class='page-header'] li:nth-child(3) a:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("Abhishek Tyagi");
		
		//There are total 8 locators:
		// 1. Xpath
		// 2. id
		// 3. Name
		// 4. LinkText
		// 5. PartialLinkText
		// 6. CssSelector
		// 7. ClassName
		// 8. htmltag
		
		
	}

}
