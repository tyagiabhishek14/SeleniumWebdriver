package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.domyshoot.com/dashboard/homePage");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		Thread.sleep(4);
		driver.navigate().to("https://www.google.com/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		Thread.sleep(4);
		driver.navigate().back();
		Thread.sleep(4);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.navigate().forward();
		Thread.sleep(4);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.navigate().refresh();
		
		
	}

}
