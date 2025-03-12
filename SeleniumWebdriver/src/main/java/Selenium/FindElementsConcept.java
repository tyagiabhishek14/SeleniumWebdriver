package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// get all links on a page.
		// get text of all links.

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
//		List <WebElement> linklist1 = driver.findElements(By.tagName("input"));
//		System.out.println(linklist1.size());
		for (int i = 0; i < linklist.size(); i++) {
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
		}

	}

}
