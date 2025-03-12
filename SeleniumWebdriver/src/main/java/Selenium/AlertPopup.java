package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();

		String text = alert.getText();
		if (text.equals("Give access to notification")) { // This is just an example
			System.out.println("This is correct alert");
		} else {
			System.out.println("In Correct alert");
		}

		// Got no such alert exception when i run this program
		// Because there is no alert available on this page.
		// This code did not work this

	}

}
