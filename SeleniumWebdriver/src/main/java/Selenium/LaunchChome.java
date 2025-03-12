package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChome {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.get("https://app.domyshoot.com/dashboard/homePage");
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		// driver.quit();
		if (title.equals("Google")) {
			System.out.println("Google launched successfully");
		}
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		// WebDriver driver1 = new FirefoxDriver();
		// driver1.get("https://app.domyshoot.com/dashboard/homePage");

	}

}
