package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		System.out.println("Hitting Xpath");
		driver.findElement(By.xpath("//input[@class='gh-search-input gh-tb ui-autocomplete-input']")).sendKeys("Java");
		Thread.sleep(2);
		driver.findElement(By.xpath("//select[@class='gh-search-categories']")).click();
		
		driver.findElement(By.xpath("//select[contains(@class,'gh-search-categories')]"));
		System.out.println("Xpath hit done");
		
		//id = test_123
		//id = test_235
		 
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]"));
		driver.findElement(By.xpath("//input[ends-with(@id,'-test')]"));
		
		//Starts-with and ends-with methods can we used to find xpath as explained above.
	
		// How to create xpath for a link
		
		driver.findElement(By.xpath("//a[contains(text().'MyAccount']"));
	}

}
