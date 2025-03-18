package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeadLessBrowserConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("tyagiabhishek14@gmail.com");
		driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).click();
		String str =  driver.getTitle();
		System.out.println(str);
		
		
		
		

	}

}
