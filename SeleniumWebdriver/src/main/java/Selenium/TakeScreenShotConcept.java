package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// Take Screenshot in Selenium.
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Copy screenshot to desired location.
		FileUtils.copyFile(src, new File("/Users/abhishektyagi/git/SeleniumWebdriver/SeleniumWebdriver/src/main/java/Selenium/google.png"));
		System.out.print("Screenshot saved");

	}

}
